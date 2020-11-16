/**
 * Created by Admin on 19.09.2017.
 */
public class RedHeadDuck extends Duck {

    RedHeadDuck(String name, int age, int weight, QuackBehavior quack, FlyBehavior fly) {
        super(name, age, weight, quack, fly);
    }

    @Override
    void display() {
        System.out.println(getName() + " | age: " + getAge() + " | weight: " + getWeight());
    }

}
