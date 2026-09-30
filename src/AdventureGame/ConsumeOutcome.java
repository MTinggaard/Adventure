package AdventureGame;

public class ConsumeOutcome {

    private ConsumeResult result;
    private String ItemName;
    private int healthChange;

    public ConsumeOutcome(ConsumeResult result, String itemName, int healthChange) {
        this.result = result;
        ItemName = itemName;
        this.healthChange = healthChange;
    }

    public ConsumeResult getResult() {
        return result;
    }

    public String getItemName() {
        return ItemName;
    }

    public int getHealthChange() {
        return healthChange;
    }
}
