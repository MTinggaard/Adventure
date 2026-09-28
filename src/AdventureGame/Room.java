package AdventureGame;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;

    private Room north;
    private Room east;
    private Room south;
    private Room west;

    private ArrayList<Item> items;

    Room(String name, String description, ArrayList<Item> items) {
        this.name = name;
        this.description = description;
        this.items = items;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Room getNorth() {
        return this.north;
    }

    public Room getSouth() {
        return this.south;
    }

    public Room getEast() {
        return this.east;
    }

    public Room getWest() {
        return this.west;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public ArrayList<Item> getItems(){
        ArrayList<Item> roomItems = new ArrayList<>();
        for (Item item : items){
            roomItems.add(item);
        }
        return roomItems;
    }

    public Item findItem(String shortName){
        if (this.items.contains(shortName)){
            return this.items.get(this.items.indexOf(shortName));
        }
        return null;
    }


}
