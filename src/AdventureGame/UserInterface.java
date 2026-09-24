package AdventureGame;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Adventure adventure = new Adventure();

    public void startProgram() throws InterruptedException {
        adventure.startGame();

        while (true) {

            lookRoom();

            System.out.print("Command -> ");

            String command = scanner.nextLine();

            if (command.equals("exit")) {
                break;
            }

            if(!parseInput(command)){
                System.out.println("There is no door in that direction");
                Thread.sleep(1000);
            }
        }
        System.out.println("Goodbye!");
    }

    public boolean parseInput(String command) {
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
        System.out.print(ANSI_GREEN + "go north\ngo east\ngo south\ngo west\nlook\nexit" + ANSI_RESET + "\n");
    }

    private static void helpMessage(){
        System.out.println("Game did not recognize that command. Try 'help' to see the available commands.");
    }

    public void lookRoom() {
        System.out.println("You are in " + adventure.getCurrentRoom().getName());
        System.out.println(adventure.getCurrentRoom().getDescription());
    }

}
