package AdventureGame;

public class Adventure {
    private Player player = new Player();
    private Map map = new Map();

    public void startGame() {
        map.BuildMap();
        player.setCurrentRoom(map.getStartRoom());

    }

    public void goNorth() {
        if (player.getCurrentRoom().getNorth() == null) {
            System.out.println("There is no door north of you.");
        } else player.setCurrentRoom(player.getCurrentRoom().getNorth());
    }

    public void goEast() {
        if (player.getCurrentRoom().getEast() == null) {
            System.out.println("There is no door east of you.");
        } else player.setCurrentRoom(player.getCurrentRoom().getEast());
    }

    public void goSouth() {
        if (player.getCurrentRoom().getSouth() == null) {
            System.out.println("There is no door south of you.");
        } else player.setCurrentRoom(player.getCurrentRoom().getSouth());
    }

    public void goWest() {
        if (player.getCurrentRoom().getWest() == null) {
            System.out.println("There is no door west of you.");
        } else player.setCurrentRoom(player.getCurrentRoom().getWest());
    }

    public void lookRoom() {
        System.out.println("You are in " + player.getCurrentRoom().getName());
        System.out.println(player.getCurrentRoom().getDescription());
    }

    public Player getPlayer() {
        return player;
    }

    public Map getMap(){
        return map;
    }

}


