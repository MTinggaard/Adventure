package AdventureGame;

public class Enemy {
    private String shortName;
    private String longName;
    private String description;
    private int health;
    private Weapon weapon;
    private Room room;

    public Enemy(String shortName, String longName, String description, int health, Weapon weapon, Room room) {
        this.shortName = shortName;
        this.longName = longName;
        this.description = description;
        this.health = health;
        this.weapon = weapon;
        this.room = room;
    }

    public AttackOutcome attack(Player player){

        if(!weapon.canUse()){
            return new AttackOutcome(AttackResult.NO_AMMUNITION, weapon);
        } else {
            player.hit(weapon.getDamage());
            weapon.use();
            return new AttackOutcome(AttackResult.ATTACKED, weapon);
        }

    }

    public boolean isDead(){
         return health <= 0;
    }

    public void hit(int damage){
        health -= damage;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public void dropItem(){
        room.addItem(weapon);
        setWeapon(null);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
