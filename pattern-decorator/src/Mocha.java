/**
 * Created by Admin on 27.09.2017.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.13f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }
}
