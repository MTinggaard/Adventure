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
            lookRoomItems();
            healthStatus();

            System.out.print("Command -> ");

            String command = scanner.nextLine().strip().toLowerCase();

            if (command.equals("exit")) {
                break;
            }

            if (!parseInput(command)) {
                System.out.println("There is no door in that direction");
                Thread.sleep(1000);
            }
        }
        System.out.println("Goodbye!");
    }

    public boolean parseInput(String command) {
        if (command.contains("take")) {
            String[] splitCommand = command.split(" ");
            if (splitCommand.length > 1) {
                if (adventure.takeItem(splitCommand[1]) == null) {
                    System.out.println("That item does not exist");
                } else System.out.println("You took the " + splitCommand[1]);
            }
            return true;
        }
        if (command.contains("drop")) {
            String[] splitCommand = command.split(" ");
            if (splitCommand.length > 1) {
                if (adventure.dropItem(splitCommand[1]) == null) {
                    System.out.println("That item is not in you're inventory");
                }
            }
            return true;
        }
        if (command.contains("consume") || command.contains("eat") || command.contains("drink")) {
            String[] splitCommand = command.split(" ");
            if (splitCommand.length > 1) {
                consume(splitCommand[1]);
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

            case "health" -> {
                lookHealth();
                return true;
            }

            default -> {
                helpMessage();
                return true;
            }
        }
    }

    public void healthStatus() {
        int playerHealth = adventure.getPlayerHealth();
        System.out.print("Health: " + playerHealth + " ");
        if (playerHealth >= 100) {
            System.out.println("you are in perfect health");
        }
        if (playerHealth <= 99 && playerHealth >= 50) {
            System.out.println("you are in good health, but avoid fighting right now");
        }
        if (playerHealth <= 49 && playerHealth >= 25) {
            System.out.println("you are wounded - find something healthy to eat");
        }
        if (playerHealth <= 24 && playerHealth >= 1) {
            System.out.println("you are barely alive");
        }
        if (playerHealth <= 0) {
            System.out.println("you should be dead");
        }
    }

    private void help() {
        System.out.println("Below is a list of useable commands:");
        System.out.println("Direction commands:");
        System.out.println(" - go north\n - go east\n - go south\n - go west");
        System.out.println("Item commands:");
        System.out.println(" - take <item>\n - drop <item>\n - look inventory\n - consume <consumable>\n - eat <consumable>\n - drink <consumable>");
        System.out.println("Misc:");
        System.out.println(" - look\n - health\n - help\n - look inventory\n - exit");
        position.mapPosition();
    }

    private static void helpMessage() {
        System.out.println("Game did not recognize that command. Try 'help' to see the available commands.");
    }

    public void lookRoom() {
        System.out.println("You are in " + adventure.getCurrentRoom().getName());
        System.out.println(adventure.getCurrentRoom().getDescription());
    }

    public void lookRoomItems() {
        if (!adventure.getCurrentRoom().getItems().isEmpty()) {
            System.out.println("Items in the room:");
            for (int i = 0; i < adventure.getCurrentRoom().getItems().size(); i++) {
                System.out.println(" - " + adventure.getCurrentRoom().getItems().get(i).getLongName());
            }
        } else System.out.println("The room is empty");
    }

    public void lookInventory() {
        if (!adventure.getInventory().isEmpty()) {
            System.out.println("You are carrying:");
            for (Item item : adventure.getInventory()) {
                System.out.println(" - " + item.getLongName());
            }
        } else System.out.println("Your inventory is empty");
    }

    public void lookHealth() {
        //System.out.println(adventure.getPlayerHealth() + " Health");
        healthStatus();
    }

    public void consume(String shortName) {
        ConsumeOutcome outcome = adventure.consume(shortName);
        switch (outcome.getResult()) {
            case ConsumeResult.NOT_FOUND -> {
                System.out.println("Couldn't find " + shortName);
            }

            case ConsumeResult.NOT_CONSUMABLE -> {
                System.out.println(outcome.getItemName() + " is not consumable");
            }

            case ConsumeResult.CONSUMED -> {
                System.out.print("you consumed " + outcome.getItemName() + " you " + (outcome.getHealthChange() > 0 ? "gained " : "lost ") + Math.abs(outcome.getHealthChange())+ " hp\n");
            }
        }
    }
}
