/**
 * Реализация ПАТТЕРНА НАБЛЮДАТЕЛЬ с помощью встроенного API JAVA
 * Класс Observable и интерфейса Observer java.util.Observable java.util.Observer
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData wd = new WeatherData();
        DisplayElement de = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(44f,76f,744f);
        wd.setMeasurements(43f,54f, 777f);
    }
}
