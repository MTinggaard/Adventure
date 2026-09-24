package AdventureGame;

import java.util.ArrayList;

public class Player {
    private Room currentRoom ;
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



}
