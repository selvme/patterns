import java.util.ArrayList;

/**
 * Created by Admin on 20.09.2017.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> watchers = new ArrayList<>();
    private ArrayList<MeasuredParameter> paramWeatherData;

    @Override
    public void notifyObServers(ArrayList<MeasuredParameter> parameters) {
        for (Observer watcher: watchers) {
            watcher.update(parameters);
        }
    }

    private void measurementsChanged(ArrayList<MeasuredParameter> parameters){
        notifyObServers(parameters);
    }

    public void setMeasurements(ArrayList<MeasuredParameter> parameters){
        paramWeatherData = new ArrayList<>(parameters);
        measurementsChanged(paramWeatherData);
    }

    @Override
    public void removeObServer(Observer watcher) {
        if (watchers.indexOf(watcher) >= 0) {
            watchers.remove(watchers.indexOf(watcher));
        }
    }

    @Override
    public void registerObServer(Observer watcher) {
        watchers.add(watcher);
    }

    @Override
    public void update() {
        measurementsChanged(paramWeatherData);
    }

}
