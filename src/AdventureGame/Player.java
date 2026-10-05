package AdventureGame;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health = 100;
    private Weapon equipped;

    public void setEquipped(Weapon equipped) {
        this.equipped = equipped;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public boolean move(String direction) {
        Room desiredRoom = switch (direction) {
            case "north" -> currentRoom.getNorth();
            case "south" -> currentRoom.getSouth();
            case "east" -> currentRoom.getEast();
            case "west" -> currentRoom.getWest();
            default -> null;
        };

        if (desiredRoom != null) {
            currentRoom = desiredRoom;
            return true;
        } else {
            return false;
        }
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public Item takeItem(String shortName) {
        if (currentRoom.findItem(shortName) != null) {
            addItem(currentRoom.findItem(shortName));
            currentRoom.removeItem(currentRoom.findItem(shortName));
            return findItem(shortName);
        }
        return null;
    }

    public Item dropItem(String shortName) {
        if (findItem(shortName) != null) {
            currentRoom.addItem(findItem(shortName));
            if ((findItem(shortName)) == equipped) {
                setEquipped(null);
            }
            removeItem(findItem(shortName));
            return currentRoom.findItem(shortName);
        }
        return null;
    }

    public Item findItem(String shortName) {
        for (Item item : getInventory()) {
            if (item.getShortName().equals(shortName)) {
                return item;
            }
        }
        return null;
    }

    public int getHealth() {
        return health;
    }

    public ConsumeOutcome consume(String shortName) {
        if ((findItem(shortName)) == null && currentRoom.findItem(shortName) == null) {
            return new ConsumeOutcome(ConsumeResult.NOT_FOUND, null, 0);
        }
        if (findItem(shortName) != null) {
            Item inventoryItem = findItem(shortName);
            if (inventoryItem instanceof Consumable) {
                health += ((Consumable) inventoryItem).getHealthPoints();
                removeItem(inventoryItem);
                return new ConsumeOutcome(ConsumeResult.CONSUMED, inventoryItem.getLongName(), ((Consumable) inventoryItem).getHealthPoints());
            }
        } else if (currentRoom.findItem(shortName) != null) {
            Item roomItem = currentRoom.findItem(shortName);
            if (roomItem instanceof Consumable) {
                health += ((Consumable) roomItem).getHealthPoints();
                currentRoom.removeItem(roomItem);
                return new ConsumeOutcome(ConsumeResult.CONSUMED, roomItem.getLongName(), ((Consumable) roomItem).getHealthPoints());
            }
        }
        Item foundItem;
        if (findItem(shortName) != null) {
            foundItem = findItem(shortName);
        } else {
            foundItem = currentRoom.findItem(shortName);
        }
        return new ConsumeOutcome(ConsumeResult.NOT_CONSUMABLE, foundItem.getLongName(), 0);
    }

    public EquipOutcome equip(String name) {
        Item foundItem = null;
        for (Item item : inventory) {
            if (item.getShortName().equals(name)){
                foundItem = item;
            }
        }
        if(!(foundItem instanceof Weapon) && foundItem != null){
            return new EquipOutcome(EquipResult.NOT_WEAPON);
        }
        for (Item weapon : inventory) {
            if (weapon.getShortName().equals(name)) {
                if (weapon instanceof Weapon) {
                    setEquipped((Weapon) weapon);
                    return new EquipOutcome(EquipResult.EQUIPPED);
                }
            }
        }
        return new EquipOutcome(EquipResult.NOT_FOUND);
    }

    public Weapon getEquipped() {
        return equipped;
    }

    public AttackOutcome attack() {
        if (equipped == null) {
            return new AttackOutcome(AttackResult.NOT_EQUIPPED, null);
        } else if (!equipped.canUse()) {
            return new AttackOutcome(AttackResult.NO_AMMUNITION, equipped);
        }
        equipped.use();
        return new AttackOutcome(AttackResult.ATTACKED, equipped);
    }


}


