package AdventureGame;

public class MeleeWeapon extends Weapon{
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
