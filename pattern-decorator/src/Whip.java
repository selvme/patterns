/**
 * Created by Admin on 27.09.2017.
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.1f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whip";
    }
}
