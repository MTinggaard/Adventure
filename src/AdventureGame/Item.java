package AdventureGame;

public class Item {
    private String shortName;
    private String longName;


    Item(String shortName, String longName) {
        this.longName = longName;
        this.shortName = shortName;
    }

    public void getShortName() {
        System.out.println(shortName);
    }

    public void getLongName() {
        System.out.println(longName);
    }
}
