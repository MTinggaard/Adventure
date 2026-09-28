package AdventureGame;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;

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
        for (Item item : currentRoom.getItems()) {
            if (currentRoom.getItems().contains(shortName)) {
                addItem(item);
                return item;
            }
        }
        return null;
    }

    public Item dropItem(String shortName) {
        if(findItem(shortName) != null){
            removeItem(findItem(shortName));
            currentRoom.addItem(findItem(shortName));
            return findItem(shortName);
        }
        return null;
    }

    public Item findItem(String shortName) {
        for (Item item : getInventory()) {
            if (getInventory().contains(shortName)) {
                return item;
            }
        }
        return null;
    }

}
