package players;

import boss.Boss;
import game.AbilityType;

public class Warrior extends Hero {

    public Warrior(int health, int attack) {

        super(health, attack, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if (getHealth() > 0) {
            int currentAttack = heroes[0].getAttack();
            heroes[0].setAttack(currentAttack + boss.getAttack());    // свой урон (currentAttack) + полученный от босса (boss.getAttack())
        } else {
            setAttack(getAttack() * 0);
        }
    }
}
// ДЗ - Warrior должен получать от босса урон, и потом наносить ему свой урон + полученный от босса   +
