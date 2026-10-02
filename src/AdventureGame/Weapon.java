package AdventureGame;

public abstract class Weapon {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public abstract boolean canUse();

    public abstract void use();

    public abstract String getAttackVerb();

    public abstract String getUsesLeftText();
}
