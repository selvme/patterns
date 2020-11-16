import java.util.ArrayList;

/**
 * Интерфейс для Измеряемого параметра, программируем на уровне интерфейса!
 * Для добавления любого параметра в список параметров доступных для получения от DataWeather
 */
public interface MeasuredParameter {

    String getName();
    float getValue();
    void setValue(float value);

    void notifyStation();
    void removeStation(Subject watcher);
    void registerStation(Subject watcher);
}
