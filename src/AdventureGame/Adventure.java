package AdventureGame;

public class Adventure {
        public static Room MakeAdventureMap(){
                Room room1 = new Room("Classroom A379", "It's 8:30 early in the morning, sharp lights hits your eyes and jolts you awake. The room is full of emptiness, and something seems off.");
                Room room2 = new Room("3rd floor common area", "There are empty classrooms all around you, usually a space full of people. Where are all the people?");
                Room room3 = new Room("Classroom E212", "Something doesn't seem right, this door dont go to this classroom. The classroom is full of sleeping students, what is going on? I need to find some clues.");
                Room room4 = new Room("Classroom A202","The small classroom is fully overgrown, you see birds flying around, almost like a jungle.");
                Room room5 = new Room("Conference room", "as you enter the conference room, you see giant pillars made of marbel aswell as a throne made of bones. A chill runs down your spine, do you hear boss music?");
                Room room6 = new Room("Codelab", "You enter codelab and finally see a familiar face. Its Tobias!");
                Room room7 = new Room("Classroom A009", "A blacksmith you think to yourself, this used to ba a 3D lab. When you enter the room a strong scent of smoke fills the area and a blasting heat makes you sweat." );
                Room room8 = new Room("Cafeteria", "A empty room but finally something you recognise as normal. The smell of food makes your belly growl but something seems off");
                Room room9 = new Room("Bicycle cellar", "you open the door to an almost pitch black cave. This is not the bike cellar i remember, you think while gathering the courage to go further in");

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

