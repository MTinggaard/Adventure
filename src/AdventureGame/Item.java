package AdventureGame;

public class Item {
    private String shortName;
    private String longName;


    Item(String shortName, String longName) {
        this.longName = longName;
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }
}
