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

    public void attack(Player player){
        player.hit(weapon.getDamage());
    }

    public boolean isDead(){
        if(health <= 0){
          dropItem();
          room.removeEnemy(this);
          return true;
        }
        return false;
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
