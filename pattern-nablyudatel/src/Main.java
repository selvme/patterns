import java.util.ArrayList;

/**
 * ПАТТЕРН НАБЛЮДАТЕЛЬ (Погодная станция)
 *
 * Определяет отношение "один-ко-многим" между объектами таким образом, что при изменении состояния одного объекта автоматически
 * оповещаются и обновляются другие связанные с ним объекты.
 *
 * - Стремиться к слабой связанности между объектами, для гибких ОО-систем.
 */

public class Main {

    public static void main(String[] args) {

	/** Создаем все нужные объекты - Объект с данными, Сами данные, данные помещаем в объект с данными, Экран для
    *   вывода параметров в удобной форме
    */
        WeatherData weatherData = new WeatherData();
        DisplayElement displayElement = new StatisticDisplay(weatherData);
        ArrayList<MeasuredParameter> parameters = new ArrayList<>();

        parameters.add(new Parameter(weatherData,"temp", 44.0f));
        parameters.add(new Parameter(weatherData,"humidity", 82f));
        parameters.add(new Parameter(weatherData,"pressure", 745.3f));
        parameters.add(new Parameter(weatherData,"wind", 8.2f));

        weatherData.setMeasurements(parameters); // Устанавливаем список параметров и WeatherData САМ оповещает экраны о изменениях

        // Установим новое значение для параметра Температуры. Параметр САМ оповестит WeatherData о новых значениях

        for (MeasuredParameter p: parameters) {
            if (p.getName().toLowerCase().equals("temp")){
                p.setValue(43.0f);
            }
        }

        System.out.println("-------------------Контрольная проверка-------------------");
        displayElement.display(true);
    }
}
