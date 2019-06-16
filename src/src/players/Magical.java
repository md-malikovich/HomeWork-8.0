package players;

import boss.Boss;
import game.AbilityType;

public class Magical extends Hero {

    public Magical(int health, int attack) {
        super(health, attack, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        for (int i = 0; i < heroes.length; i++) {
            int currentAttack = heroes[i].getAttack();
            heroes[i].setAttack(currentAttack + 7);     // после каждого раунда атака увеличивается на 7
        }
    }
}
// ДЗ - Magical должен увеличивать атаку каждого героя после каждого раунда на n-ное количество   +
