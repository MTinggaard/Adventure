package AdventureGame;

public class AttackOutcome {
    private AttackResult result;
    private AttackResult counterAttackResult;
    private Weapon weapon;

    public AttackOutcome(AttackResult result, Weapon weapon) {
        this.result = result;
        this.weapon = weapon;
    }

    public AttackOutcome(AttackResult result, AttackResult counterAttackResult ,Weapon weapon) {
        this.result = result;
        this.counterAttackResult = counterAttackResult;
        this.weapon = weapon;
    }

    public AttackResult getResult() {
        return result;
    }

    public AttackResult getCounterAttackResult(){
        return counterAttackResult;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
