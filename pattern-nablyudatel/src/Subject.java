import java.util.ArrayList;

/**
 * Интерфейс для Субъекта наблюдений
 */
public interface Subject {

    void notifyObServers(ArrayList<MeasuredParameter> parameters);
    void removeObServer(Observer watcher);
    void registerObServer(Observer watcher);
    void update();
}
