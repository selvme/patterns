/**
 * Created by Admin on 27.09.2017.
 */
public class Decaf extends Beverage {

    Decaf(){
        super.description = "Decaf Coffee";
    }

    @Override
    public float cost() {
        return 0.99f;
    }
}
