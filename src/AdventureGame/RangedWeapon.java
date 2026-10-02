package AdventureGame;

public class RangedWeapon extends Weapon{

    private int ammunition;

    public RangedWeapon(int ammunition) {
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
