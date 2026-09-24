package AdventureGame;

import java.util.Scanner;

public class UserInterface {

    Room currentRoom = Adventure.MakeAdventureMap();

    public void runGame() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("You are in " + currentRoom.getName() + ": ");
            System.out.println(currentRoom.getDescription());

            System.out.print("Command -> ");
            String command = scanner.nextLine().strip().toLowerCase();

            if (command.equals("exit")) {
                break;
            }

            switch (command) {
                case "go north", "w", "up" -> goNorth();
                case "go east", "d", "right" -> goEast();
                case "go south", "s", "down" -> goSouth();
                case "go west", "a", "left" -> goWest();
                case "look" -> lookRoom();
                case "help" -> help();
            }

        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    private void lookRoom() {
        System.out.println("You are in " + currentRoom.getName());
        System.out.println(currentRoom.getDescription());
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private void help() {
        System.out.println("Below is a list of useable commands:");
        System.out.print(ANSI_GREEN + "go north\ngo east\ngo south\ngo west\nlook\nexit" + ANSI_RESET + "\n");
    }


    private void goNorth() {
        if (currentRoom.getNorth() == null) {
            System.out.println("There is no door north of you.");
        } else currentRoom = currentRoom.getNorth();
    }

    private void goEast() {
        if (currentRoom.getEast() == null) {
            System.out.println("There is no door east of you.");
        } else currentRoom = currentRoom.getEast();
    }

    private void goSouth() {
        if (currentRoom.getSouth() == null) {
            System.out.println("There is no door south of you.");
        } else currentRoom = currentRoom.getSouth();
    }

    private void goWest() {
        if (currentRoom.getWest() == null) {
            System.out.println("There is no door west of you.");
        } else currentRoom = currentRoom.getWest();
    }
}
