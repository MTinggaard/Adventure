package AdventureGame;

public class Consumable extends Item {
    private int healthPoints;

    Consumable(String shortName, String longName, int health) {
        super(shortName, longName);
        this.healthPoints = health;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
