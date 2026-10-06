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
    private ArrayList<Enemy> enemies;

    Room(String name, String description, ArrayList<Item> items, ArrayList<Enemy> enemies) {
        this.name = name;
        this.description = description;
        this.items = items;
        this.enemies = enemies;
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
        return items;
    }

    public Item findItem(String shortName){
        for (Item item : items){
            if(item.getShortName().equals(shortName)){
                return item;
            }
        }
        return null;
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy){
        enemies.remove(enemy);
    }

    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }

    public Enemy findEnemy(String shortName){
        for (Enemy enemy : enemies){
            if(enemy.getShortName().equals(shortName)){
                return enemy;
            }
        }
        return null;
    }

}
