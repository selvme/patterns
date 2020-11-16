/**
 * Фабричный метод - пораждающий шаблон проектирования, предоставляющий подклассам интерфейс для создания
 * экземпляров некоторого класса.
 * В момент создания наследники могут определить, какой класс создавать
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(pizzaByCheck("Мексиканская").getName());

    }
    // Создадим метод-фасад, который будет создавать выбранную клиентом пиццу.
    static Pizza pizzaByCheck(String p){
        switch (p) {
            case "Итальянская":
                return new CreaterItallianPizza().createPizza();
            case "Мексиканская":
                return new CreaterMexicanHotPizza().createPizza();
            default:
                throw new RuntimeException("Мы не готовим такую пиццу");
        }
    }
}
/**
 * Продукт, который может быть представлен несколькими видами
 */

interface Pizza{
    String getName();
}
class ItallianPizza implements Pizza{

    @Override
    public String getName() {
        return "Итальянская Тонкая";
    }
}
class MexicanHotPizza implements Pizza{

    @Override
    public String getName() {
        return "Мексиканская Острая";
    }
}

/**
 * Абстрактный класс шеф-повора
 * Может быть представлен и интерфейсом, но т.к. один производитель может производить только 1го вида товар
 * то мы используем абстракный класс.
 * Классы-наследники могут наследоваться только от 1го класса. Реализации интерфейса мб больше чем один.
 */
abstract class CreaterPizza{
    abstract Pizza createPizza();
}
class CreaterItallianPizza extends CreaterPizza{

    @Override
    Pizza createPizza() {
        return new ItallianPizza();
    }
}
class CreaterMexicanHotPizza extends CreaterPizza{

    @Override
    Pizza createPizza() {
        return new MexicanHotPizza();
    }
}
