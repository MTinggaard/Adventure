package AdventureGame;

import java.util.ArrayList;

public class Adventure {
    private Player player = new Player();
    private Map map = new Map();

    public void startGame() {
        map.buildMap();
        player.setInventory(new ArrayList<Item>());
        player.setCurrentRoom(map.getStartRoom());
    }

    public boolean goNorth() {
        return player.move("north");
    }

    public boolean goEast() {
        return player.move("east");
    }

    public boolean goSouth() {
        return player.move("south");
    }

    public boolean goWest() {
        return player.move("west");
    }

    public Player getPlayer() {
        return player;
    }

    public Map getMap() {
        return map;
    }

    public Room getCurrentRoom(){
        return player.getCurrentRoom();
    }

    public ArrayList<Item> getInventory(){
        return player.getInventory();
    }

    public Item takeItem(String shortName){
        return player.takeItem(shortName);
    }

    public Item dropItem(String shortName){
        return player.dropItem(shortName);
    }

    public int getPlayerHealth(){
        return player.getHealth();
    }

}


