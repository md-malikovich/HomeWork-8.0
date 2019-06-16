package players;

import boss.Boss;
import game.AbilityType;

public class Hunter extends Hero {

    public Hunter(int health, int attack) {

        super(health, attack, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        int a = 2 + (int) ( Math.random() * 2);
        setAttack(getAttack() * a);     // каждая атака увеличивается на рандомное число "а"
    }
}
// ДЗ - Hunter каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.   +
