/**
 * Created by Admin on 27.09.2017.
 */
public class DarkRoast extends Beverage {

    DarkRoast(){
        super.description = "Dark Roast Coffee";
    }

    @Override
    public float cost() {
        return 1.30f;
    }
}
