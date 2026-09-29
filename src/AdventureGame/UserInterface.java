package AdventureGame;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Adventure adventure = new Adventure();
    Position position = new Position(adventure);

    public void startProgram() throws InterruptedException {
        adventure.startGame();

        while (true) {
            Thread.sleep(1000);

            lookRoom();

            System.out.print("Command -> ");

            String command = scanner.nextLine().strip().toLowerCase();

            if (command.equals("exit")) {
                break;
            }

            if (!parseInput(command)) {
                System.out.println("There is no door in that direction");
            }
        }
        System.out.println("Goodbye!");
    }

    public boolean parseInput(String command) {
        if (command.contains("take")) {
            String[] splitCommand = command.split(" ");
            if (splitCommand.length > 1) {
                if (adventure.getPlayer().takeItem(splitCommand[1]) == null) {
                    System.out.println("That item does not exist");
                }
            }
            return true;
        }
        if (command.contains("drop")) {
            String[] splitCommand = command.split(" ");
            if (splitCommand.length > 1) {
                if (adventure.getPlayer().dropItem(splitCommand[1]) == null) {
                    System.out.println("That item is not in you're inventory");
                }
            }
            return true;
        }

        switch (command) {
            case "go north", "w", "up" -> {
                return adventure.goNorth();
            }
            case "go east", "d", "right" -> {
                return adventure.goEast();
            }
            case "go south", "s", "down" -> {
                return adventure.goSouth();
            }
            case "go west", "a", "left" -> {
                return adventure.goWest();
            }
            case "look" -> {
                lookRoom();
                return true;
            }
            case "help" -> {
                help();
                return true;
            }

            case "look inventory" -> {
                lookInventory();
                return true;
            }

            default -> {
                helpMessage();
                return true;
            }
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private void help() {
        System.out.println("Below is a list of useable commands:");
        System.out.println("Direction commands:");
        System.out.println(" - go north\n - go east\n - go south\n - go west");
        System.out.println("Item commands:");
        System.out.println(" - take <item>\n - drop <item>\n - look inventory");
        System.out.println("Misc:");
        System.out.println(" - look\n - help\n - exit");
        //System.out.print(ANSI_GREEN + "go north\ngo east\ngo south\ngo west\nlook\nexit\ntake <item>\ndrop <item>\nlook inventory" + ANSI_RESET + "\n");
        position.mapposistion();
    }

    private static void helpMessage() {
        System.out.println("Game did not recognize that command. Try 'help' to see the available commands.");

    }

    public void lookRoom() {
        System.out.println("You are in " + adventure.getCurrentRoom().getName());
        System.out.println(adventure.getCurrentRoom().getDescription());
        if (!adventure.getCurrentRoom().getItems().isEmpty()) {
            System.out.println("Items:");
            for (int i = 0; i < adventure.getCurrentRoom().getItems().size(); i++) {
                System.out.println(" - " + adventure.getCurrentRoom().getItems().get(i).getLongName());
            }
        } else System.out.println("The room is empty");
    }

    public void lookInventory() {
        if (!adventure.getPlayer().getInventory().isEmpty()) {
            System.out.println("You are carrying:");
            for (Item item : adventure.getPlayer().getInventory()) {
                System.out.println(" - " + item.getLongName());
            }
        } else System.out.println("Your inventory is empty");
    }

}
