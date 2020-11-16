import java.util.Observable;
import java.util.Observer;

/**
 * Created by Admin on 26.09.2017.
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    Observable observable;
    private float temp;
    private float humidity;

    CurrentConditionsDisplay(Observable ob){
        this.observable = ob;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("| " + temp + " | " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            this.temp = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }
}
