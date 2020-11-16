/**
 * Created by Admin on 27.09.2017.
 */
public class Espresso extends Beverage {

    Espresso(){
        super.description = "Espresso";
    }

    @Override
    public float cost() {
        return 1.99f;
    }
}
