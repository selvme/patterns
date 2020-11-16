/**
 *
 * ПАТТЕРН СТРАТЕГИЯ
 *
 * Определяет семейство алгоритмов, инкапсулирует каждый из них(Behavoir) и обеспечивает их взаимозаменяемость.
 * Он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента.
 *
 * Основные принципы:
 * - Инкапсулируем частые или возможные изменеия
 * - Программируем на уровне интерфейса, а не на уровне реализации
 * - Отдаем предпочтения композициям перед наследованием (возможностей, опций и пр.)
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck("Seriy", 1, 12, new Quack(), new FlyWithWings()));
        ducks.add(new RedHeadDuck("Dima", 2, 8, new Quack(), new FlyWithWings()));
        ducks.add(new RubberDuck("Slava", 3, 15, new Squeak(), new NotFly()));
        ducks.add(new DecoyDuck("Valya", 4, 15, new MuteQuack(), new NotFly()));

        for (Duck duck:ducks) {
            duck.display();
            duck.performQuack();
            duck.performFly();
            duck.swim();
            System.out.println("------------------------------------------");
        }

        ModelDuck modDuck = new ModelDuck("Andrey", 5, 15, new MuteQuack(), new NotFly());
        modDuck.display();
        modDuck.performFly();
        modDuck.setFlyBehavior(new FlyOnRocket());
        modDuck.performFly();
    }
}
