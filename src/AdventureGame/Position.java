package AdventureGame;

public class Position {
    Adventure adventure;
    Player player;
    Visual visual = new Visual();

    public Position(Adventure adventure) {
        this.adventure = adventure;
        this.player = adventure.getPlayer();
    }

    public void mapPosition() {
        if (player.getCurrentRoom() == adventure.getMap().getRooms().get(0)) {
            visual.showroom1();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(1)) {
            visual.showroom2();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(2)) {
            visual.showroom3();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(3)) {
            visual.showroom4();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(4)) {
            visual.showroom5();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(5)) {
            visual.showroom6();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(6)) {
            visual.showroom7();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(7)) {
            visual.showroom8();
        }
        else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(8)) {
            visual.showroom9();
        }
    }
}
