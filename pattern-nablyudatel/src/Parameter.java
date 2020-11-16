import java.util.ArrayList;

/**
 * Created by Admin on 20.09.2017.
 */
public class Parameter implements MeasuredParameter {

    private ArrayList<Subject> station;
    private final String NAME;
    private float value;

    Parameter(Subject weatherData, String name, float value){
        this.station = new ArrayList<>();
        this.NAME = name.toLowerCase();
        this.value = value;
        station.add(weatherData);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public float getValue() {
        return value;
    }

    @Override
    public void setValue(float value) {
        this.value = value;
        notifyStation();
    }

    @Override
    public void notifyStation() {
        for (Subject s: station) {
            s.update();
        }
    }

    @Override
    public void removeStation(Subject watcher) {
        if (station.indexOf(watcher) >= 0) {
            station.remove(station.indexOf(watcher));
        }
    }

    @Override
    public void registerStation(Subject watcher) {
        station.add(watcher);
    }
}
