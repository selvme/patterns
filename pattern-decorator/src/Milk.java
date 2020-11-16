/**
 * Created by Admin on 27.09.2017.
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.2f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk";
    }
}
