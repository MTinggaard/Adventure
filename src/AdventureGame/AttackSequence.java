package AdventureGame;

public class AttackSequence {

    public AttackOutcome attackSequence(Player player, String enemyName) {
        Room currentRoom = player.getCurrentRoom();
        Weapon playerWeapon = player.getEquipped();

        Enemy enemy = currentRoom.findEnemy(enemyName);

        if (enemy == null) {
            return new AttackOutcome(AttackResult.NOT_FOUND, null);
        } else {
            AttackOutcome attackOutcome = player.attack(enemy);

            if (attackOutcome.getResult() == AttackResult.NOT_EQUIPPED || attackOutcome.getResult() == AttackResult.NO_AMMUNITION) {
                return attackOutcome;
            }

            if (enemy.isDead()) {
                return new AttackOutcome(AttackResult.ENEMY_KILLED, playerWeapon);
            }

            AttackOutcome counterAttack = enemy.attack(player);

            if (player.isDead()) {
                return new AttackOutcome(AttackResult.PLAYER_KILLED, counterAttack.getResult(), playerWeapon);
            }
            return new AttackOutcome(AttackResult.ATTACKED, counterAttack.getResult(), playerWeapon);
        }
    }

    public AttackOutcome attackSequence(Player player) {
        Room currentRoom = player.getCurrentRoom();
        Weapon playerWeapon = player.getEquipped();

        if (!currentRoom.getEnemies().isEmpty()) {
            Enemy enemy = currentRoom.getEnemies().getFirst();

            AttackOutcome attackOutcome = player.attack(enemy);

            if (attackOutcome.getResult() == AttackResult.NOT_EQUIPPED || attackOutcome.getResult() == AttackResult.NO_AMMUNITION) {
                return attackOutcome;
            }

            if (enemy.isDead()) {
                return new AttackOutcome(AttackResult.ENEMY_KILLED, playerWeapon);
            }

            AttackOutcome counterAttack = enemy.attack(player);

            if (player.isDead()) {
                return new AttackOutcome(AttackResult.PLAYER_KILLED, counterAttack.getResult(), playerWeapon);
            }
            return new AttackOutcome(AttackResult.ATTACKED, counterAttack.getResult(), playerWeapon);
        }
        return player.attack(null);
    }
}

