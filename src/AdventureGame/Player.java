package AdventureGame;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    int health ;


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

    public int getHealth(){
        return health;
    }

}
