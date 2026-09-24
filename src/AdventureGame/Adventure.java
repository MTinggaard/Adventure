package AdventureGame;

public class Adventure {
    private Player player = new Player();
    private Map map = new Map();

    public void startGame() {
        map.BuildMap();
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

}


