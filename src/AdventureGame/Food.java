package AdventureGame;

public class Food extends Item {
    private int healthPoints;

    Food(String shortName, String longName, int healthPoints){
        super(shortName, longName);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
