package AdventureGame;

import java.util.ArrayList;

public class Map {
    private Room startRoom;
    private ArrayList<Room> rooms = new ArrayList<>();

    public void buildMap(){
        Room room1 = new Room("Classroom A379", "It's 8:30 early in the morning, sharp lights hits your eyes and jolts you awake. The room is full of emptiness, and something seems off.", new ArrayList<Item>(), new ArrayList<Enemy>());
        room1.addItem(new Liquid("potion",  "a bright red health " + "\u001B[4m" + "potion" + "\u001B[0m" + " in a glass bottle", 50));
        room1.addItem(new Liquid("potion", "a bright red health potion in a glass bottle", 50));
        rooms.add(room1);

        Room room2 = new Room("3rd floor common area", "There are empty classrooms all around you, usually a space full of people. Where are all the people?", new ArrayList<Item>(), new ArrayList<Enemy>());
        room2.addItem(new Liquid("coffee","burning hot coffee",40));
        room2.addEnemy(new Enemy("mads","wise munk","a teacher you remember now a wise monk",100,new MeleeWeapon("knuckles","brass knuckles",20),room2));
        rooms.add(room2);


        Room room3 = new Room("Classroom E212", "Something doesn't seem right, this door dont go to this classroom. The classroom is full of sleeping students, what is going on? I need to find some clues.", new ArrayList<Item>(), new ArrayList<Enemy>());
        room3.addItem(new Food("beetroot","a white spotted beetroot" , 30));
        rooms.add(room3);
        room3.addEnemy(new Enemy("michael","hacker man","a former teacher now has turned to the dark side and startet a new life as a hacker he uses a computer that shoot hacker beams",75,new RangedWeapon("computer","hacker computer",15,8),room3));


        Room room4 = new Room("Classroom A202","The small classroom is fully overgrown, you see birds flying around, almost like a jungle.", new ArrayList<Item>(), new ArrayList<Enemy>());
        rooms.add(room4);
        room4.addItem(new MeleeWeapon("knife", "a rusty old knife", 10));
        room4.addEnemy(new Enemy("red","a red angry looking bird","something",25,new MeleeWeapon("claw","the claws of a bird",5),room4));
        room4.addEnemy(new Enemy("yellow","a yellow angry looking bird","something",25,new MeleeWeapon("claw","the claws of a bird",5),room4));
        room4.addEnemy(new Enemy("black","a black angry looking bird","something",25,new RangedWeapon("bomb","the bird carries eggs as bombs",50,1),room4));
        room4.addItem(new Food("mushroom","bright red mushroom",20));
        room4.addItem(new Food("mushroom","bright red mushroom",20));
        room4.addItem(new Food("mushroom","bright red mushroom",20));

        Room room5 = new Room("Conference room", "As you enter the conference room, you see giant pillars made of marble as well as a throne made of bones. A chill runs down your spine, do you hear boss music?", new ArrayList<Item>(), new ArrayList<Enemy>());
        rooms.add(room5);
        room5.addEnemy(new Enemy("david", "protector of the throne", "a teacher you recognise has now turned into an giant orc like bieng",100, new MeleeWeapon("axe", "two-handed battleaxe", 25), room5));

        Room room6 = new Room("Codelab", "You enter codelab and finally see a familiar face. Its Tobias!", new ArrayList<Item>(), new ArrayList<Enemy>());
        room6.addItem(new Liquid("bottle","a bottle filled with a bright glowing blue liquid",5));
        room6.addEnemy(new Enemy("tobias","Tobias the mage","a former programing teacher has now learned the language of magic",100,new RangedWeapon("wand","a magical wand of shooting",25,15),room6));
        rooms.add(room6);

        Room room7 = new Room("Classroom A009", "A blacksmith you think to yourself, this used to ba a 3D lab. When you enter the room a strong scent of smoke fills the area and a blasting heat makes you sweat.", new ArrayList<Item>(), new ArrayList<Enemy>());
        rooms.add(room7);
        room7.addItem(new RangedWeapon("bow", "a modern compound bow",50 ,6));


        Room room8 = new Room("Cafeteria", "An empty room but finally something you recognise as normal. The smell of food makes your belly growl but something seems off", new ArrayList<Item>(), new ArrayList<Enemy>());
        room8.addItem(new Food("apple","a gold shining apple that lights up the room", 100));
        rooms.add(room8);

        Room room9 = new Room("Bicycle cellar", "you open the door to an almost pitch black cave. This is not the bike cellar i remember, you think while gathering the courage to go further in", new ArrayList<Item>(), new ArrayList<Enemy>());
        room9.addItem(new Item("bike","a broken bicycle"));
        rooms.add(room9);
        room9.addItem(new RangedWeapon("revolver", "an old revolver",35 ,8));
        room9.addEnemy(new Enemy("spider","giant spider","ginormous spider",70,new MeleeWeapon("fang","a long spider fang",20),room9));
        room9.addItem(new Liquid("potion", "a bright red health potion in a glass bottle", 50));


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

        startRoom = room1;
    }



    public Room getStartRoom(){
        return startRoom;
    }



    private static void connectEastWest(Room a, Room b){
        a.setEast(b);
        b.setWest(a);
    }
    private static void connectNorthSouth(Room a, Room b){
        a.setNorth(b);
        b.setSouth(a);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
