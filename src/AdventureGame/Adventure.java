package AdventureGame;

public class Adventure {
        public static Room MakeAdventureMap(){
                Room room1 = new Room("Room 1", "a light and comfortable room you see two doors going somewhere");
                Room room2 = new Room("Room 2", "a light and comfortable room you see two doors going somewhere");
                Room room3 = new Room("Room 3", "a light and comfortable room you see two doors going somewhere");
                Room room4 = new Room("Room 4", "a light and comfortable room you see two doors going somewhere");
                Room room5 = new Room("Room 5", "a light and comfortable room you see two doors going somewhere");
                Room room6 = new Room("Room 6", "a light and comfortable room you see two doors going somewhere");
                Room room7 = new Room("Room 7", "a light and comfortable room you see two doors going somewhere");
                Room room8 = new Room("Room 8", "a light and comfortable room you see two doors going somewhere");
                Room room9 = new Room("Room 9", "a light and comfortable room you see two doors going somewhere");

                //Room connections
                connectEastWest(room1, room2);

                connectEastWest(room2, room3);

                connectNorthSouth(room4, room1);

                connectNorthSouth(room7, room4);

                connectNorthSouth(room6, room3);

                connectNorthSouth(room9, room6);

                connectEastWest(room7, room8);

                connectEastWest(room8, room9);

                connectNorthSouth(room8, room5);


                return room1;
        }

        private static void connectEastWest(Room a, Room b){
                a.setEast(b);
                b.setWest(a);
        }
        private static void connectNorthSouth(Room a, Room b){
                a.setNorth(b);
                b.setSouth(a);
        }
    }

