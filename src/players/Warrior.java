package players;

import boss.Boss;
import game.AbilityType;

public class Warrior extends Hero {

    public Warrior(int health, int attack) {

        super(health, attack, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        for (int i = 0; i < heroes.length; i++) {
            int currentAttack1 = heroes[i].getAttack();
            heroes[i].setAttack(currentAttack1 + boss.getAttack());
        }
    }
}
// Warrior должен получать от босса урон, и потом наносить ему свой урон + полученный от босса   +