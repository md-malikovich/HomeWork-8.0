package players;

import boss.Boss;
import game.AbilityType;

public class Hunter extends Hero {

    public Hunter(int health, int attack) {

        super(health, attack, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        //int a = (int) (Math.random()*(1+1)) + 2;
        int a = 2 + (int) ( Math.random() * 2 );
            int currentAttack = heroes[2].getAttack();
            heroes[2].setAttack(currentAttack * a);     // каждая атака увеличивается на рандомное число "а"
    }
}
// ДЗ - Hunter каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.   +
