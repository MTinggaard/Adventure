package AdventureGame;

public class Position {
    Adventure adventure;
    Player player;


    public Position(Adventure adventure) {
        this.adventure = adventure;
        this.player = adventure.getPlayer();
    }

    public void mapPosistion() {
        if (player.getCurrentRoom() == adventure.getMap().getRooms().get(0)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|     🕺      |   |            |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|            |    |            |   |            |");
            System.out.println("|----    ----|    |----   -----|   |----   -----|");
            System.out.println("    |   |             |   |            |   |");
            System.out.println("|----     ----|___|---    -----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(1)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |      🕺    |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|            |    |            |   |            |");
            System.out.println("|----    ----|    |----   -----|   |----    ----|");
            System.out.println("    |   |             |   |             |   |");
            System.out.println("|----     ----|___|---    -----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(2)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |            |   |     🕺     |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|            |    |            |   |            |");
            System.out.println("|----    ----|    |----    ----|   |----    ----|");
            System.out.println("    |   |             |    |            |   |");
            System.out.println("|----     ----|___|---     ----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(3)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|     🕺     |    |            |   |            |");
            System.out.println("|----    ----|    |----    ----|   |----    ----|");
            System.out.println("    |   |             |    |            |   |");
            System.out.println("|----     ----|___|---     ----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(4)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|            |    |     🕺     |   |            |");
            System.out.println("|----    ----|    |----    ----|   |----    ----|");
            System.out.println("    |   |             |    |            |   |");
            System.out.println("|----     ----|___|---     ----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(5)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |      🕺    |");
            System.out.println("|            |    |            |   |            |");
            System.out.println("|----    ----|    |----    ----|   |----    ----|");
            System.out.println("    |   |             |    |            |   |");
            System.out.println("|----     ----|___|---     ----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(6)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|            |    |            |   |            |");
            System.out.println("|----    ----|    |----    ----|   |----    ----|");
            System.out.println("    |   |             |    |            |   |");
            System.out.println("|----     ----|___|---     ----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|      🕺     |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(7)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|            |    |            |   |            |");
            System.out.println("|----    ----|    |----    ----|   |----    ----|");
            System.out.println("    |   |             |    |            |   |");
            System.out.println("|----     ----|___|---     ----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___      🕺      ___    cellar   |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|-------------|   |------------|   |------------|");
        } else if (player.getCurrentRoom() == adventure.getMap().getRooms().get(8)) {
            System.out.println("|-------------|___|------------|___|------------|");
            System.out.println("|    room            3rd floor         room     |");
            System.out.println("|    A 379     ___  common area ___    E 212    |");
            System.out.println("|             |   |            |   |            |");
            System.out.println("|----     ----|   |------------|   |----    ----|");
            System.out.println("    |   |                               |   |");
            System.out.println("|----    ----|    |------------|   |----    ----|");
            System.out.println("|    room    |    | Conference |   |   Codelab  |");
            System.out.println("|    A 202   |    |    room    |   |            |");
            System.out.println("|            |    |            |   |            |");
            System.out.println("|----    ----|    |----    ----|   |----    ----|");
            System.out.println("    |   |             |    |            |   |");
            System.out.println("|----     ----|___|---     ----|___|----    ----|");
            System.out.println("|    room            cafeteria         bicycle  |");
            System.out.println("|    A 009     ___              ___    cellar   |");
            System.out.println("|             |   |            |   |     🕺     |");
            System.out.println("|-------------|   |------------|   |------------|");
        }
    }
}
