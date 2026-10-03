package AdventureGame;

public class RangedWeapon extends Weapon{

    private int ammunition;

    RangedWeapon(String shortName, String longName, int ammunition) {
        super(shortName, longName);
        this.ammunition = ammunition;
    }


    @Override
    public boolean canUse() {
        return false;
    }

    @Override
    public void use() {

    }

    @Override
    public String getAttackVerb() {
        return "";
    }

    @Override
    public String getUsesLeftText() {
        return "";
    }
}
