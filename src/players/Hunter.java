package players;

import boss.Boss;
import game.AbilityType;
import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int attack) {

        super(health, attack, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        Random random = new Random();
        for (int i = 2; i < heroes.length; i++) {
            int r = random.nextInt(4);
            int currentAttack = heroes[i].getAttack();
            heroes[i].setAttack(currentAttack * r);
        }
    }
}
// Hunter каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.   +
