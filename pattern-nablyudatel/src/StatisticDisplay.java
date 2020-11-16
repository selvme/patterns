import java.util.ArrayList;

/**
 * Created by Admin on 20.09.2017.
 */
public class StatisticDisplay implements DisplayElement, Observer {

    private boolean state = false;
    private Subject weatherData;
    private ArrayList<MeasuredParameter> parametersDisplay = new ArrayList<>();

    StatisticDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObServer(this);
    }

    @Override
    public void display(boolean state) {
        this.state = state;
        if (this.state){
            System.out.println("---------- StatisticDisplay ----------");
            for (MeasuredParameter p: parametersDisplay) {
                System.out.print(" | " + p.getName() + " - " + p.getValue());
            }
            System.out.print("\n");
            System.out.println("--------------------------------------");
        }
    }

    @Override
    public void update(ArrayList<MeasuredParameter> parameters) {
        parametersDisplay = parameters;
        display(true);
    }
}
