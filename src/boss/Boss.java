package boss;

import java.util.Random;
import game.GameEntity;

public class Boss extends GameEntity {

    public Boss(int health, int attack) {

        super(health, attack);
    }

    @Override
    public int getAttack() {

        Random rand = new Random();
        int i = rand.nextInt(100);    // Каждый удар Босса имеет рандомный урон в пределах 100
        return i;
    }
}
// Задание на сообразительность - Каждый удар Босса имеет рандомный урон   +
