package AdventureGame;

public class Room {
    private String name;
    private String description;

    private Room north;
    private Room east;
    private Room south;
    private Room west;

    Room(String name, String description) {
        this.name = name;
        this.description = description;
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

}
