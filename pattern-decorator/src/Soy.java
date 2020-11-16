/**
 * Created by Admin on 27.09.2017.
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.15f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy";
    }
}
