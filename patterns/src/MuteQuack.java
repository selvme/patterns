/**
 * Created by Admin on 19.09.2017.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<<< Silence >>>>");
    }
}
