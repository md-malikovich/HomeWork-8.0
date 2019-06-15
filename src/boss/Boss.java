package boss;

import java.util.Random;
import game.GameEntity;

public class Boss extends GameEntity {

    public Boss(int health, int attack) {
        super(health, attack);
    }

    public int getAttack() {

        Random rand = new Random();
        for (int i = 30; i <= 100; i++) {
            int n = rand.nextInt(50);
            return n;
        } return 0;
    }
}
// Задание на сообразительность - Каждый удар Босса имеет рандомный урон   +
