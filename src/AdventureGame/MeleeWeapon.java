package AdventureGame;

public class MeleeWeapon extends Weapon{
    MeleeWeapon(String shortName, String longName) {
        super(shortName, longName);
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
