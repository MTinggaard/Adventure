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
            } else if (command.equals("go north")) {
                goNorth();
            } else if (command.equals("go east")) {
                goEast();
            } else if (command.equals("go south")) {
                goSouth();
            } else if (command.equals("go west")) {
                goWest();
            } else if (command.equals("look")) {
                lookRoom();
            } else if (command.equals("help"))
                help();
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    private void lookRoom() {
        System.out.println("You are in " + currentRoom.getName());
        System.out.println(currentRoom.getDescription());
    }

    private void help(){
        System.out.println("go north");
        System.out.println("go east");
        System.out.println("go south");
        System.out.println("go west");
        System.out.println("look");
        System.out.println("exit");
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
