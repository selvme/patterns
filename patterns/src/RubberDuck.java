/**
 * Created by Admin on 19.09.2017.
 */
public class RubberDuck extends Duck {

    RubberDuck(String name, int age, int weight, QuackBehavior quack, FlyBehavior fly) {
        super(name, age, weight, quack, fly);
    }

    @Override
    void display() {
        System.out.println(getName() + " | age: " + getAge() + " | weight: " + getWeight());
    }

}
