/**
 * Класс всех напитков
 * Почему не интерфейс? Потому что нам уже был выдал данный класс из существующей реализации в организации
 */

public abstract class Beverage {
    protected String description;

    public abstract float cost();

    public String getDescription() {
        return description;
    }
}
