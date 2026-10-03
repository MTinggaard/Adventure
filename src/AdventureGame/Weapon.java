package AdventureGame;

public abstract class Weapon extends Item{
    private int damage;

    Weapon(String shortName, String longName) {
        super(shortName, longName);
    }

    public int getDamage() {
        return damage;
    }

    public abstract boolean canUse();

    public abstract void use();

    public abstract String getAttackVerb();

    public abstract String getUsesLeftText();
}
