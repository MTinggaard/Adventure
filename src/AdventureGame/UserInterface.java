package AdventureGame;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Adventure adventure = new Adventure();

    public void startProgram() {
        adventure.startGame();

        while (true) {

            adventure.lookRoom();

            System.out.print("Command -> ");

            String command = scanner.nextLine();

            if (command.equals("exit")) {
                break;
            }

            parseInput(command);
        }
        System.out.println("Goodbye!");
    }

    public void parseInput(String command) {
        switch (command) {
            case "go north", "w", "up" -> adventure.goNorth();
            case "go east", "d", "right" -> adventure.goEast();
            case "go south", "s", "down" -> adventure.goSouth();
            case "go west", "a", "left" -> adventure.goWest();
            case "look" -> adventure.lookRoom();
            case "help" -> help();
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private void help() {
        System.out.println("Below is a list of useable commands:");
        System.out.print(ANSI_GREEN + "go north\ngo east\ngo south\ngo west\nlook\nexit" + ANSI_RESET + "\n");
    }


}
