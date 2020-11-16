/**
 * Created by Admin on 27.09.2017.
 */
public class HouseBlend extends Beverage {

    HouseBlend(){
        super.description = "House Blend Coffee";
    }

    @Override
    public float cost() {
        return 0.89f;
    }
}
