/**
 * Абстрактная фабрика - порождающий шаблон проектирования, представляет собой интерфейс или абстрактный класс
 * для создания семейства взаимосвязанных или взаимозависимых объектов, не специфицируя их конкретных классов.
 */
public class Main {

    public static void main(String[] args) {
	    KitchenFactory kitchen = createKitchen("RU");
	    kitchen.getKitchenName();
        System.out.println(kitchen.createPizza().getName());
        System.out.println(kitchen.createSoup().getName());
        System.out.println(kitchen.createSalad().getName());
    }
    static KitchenFactory createKitchen(String lang){
        switch (lang){
            case "RU":  return new RussianKitchen();
            case "MX":  return new MexicanKitchen();
            case "IT":  return new ItallianKitchen();
            default:    throw new RuntimeException("Такой кухни у нас нет");
        }
    }
}

abstract class KitchenFactory{ // может быть представлен интерфейсом
    abstract void getKitchenName();
    abstract Food createPizza();
    abstract Food createSalad();
    abstract Food createSoup();
}
class RussianKitchen extends KitchenFactory{

    void getKitchenName() {
        System.out.println("---------Русская кухня---------");
    }

    Food createPizza() {
        return new Pizza("Русская пицца", 400, 800);
    }

    Food createSalad() {
        return new Salad("Русский салат", 400, 800);
    }

    Food createSoup() {
        return new Soup("Русский суп", 400, 800);
    }
}
class MexicanKitchen extends KitchenFactory{

    @Override
    void getKitchenName() {
        System.out.println("---------Мексиканская кухня---------");
    }

    @Override
    Food createPizza() {
        return new Pizza("Мексиканская пицца", 400, 800);
    }

    @Override
    Food createSalad() {
        return new Salad("Мексиканский салат", 400, 800);
    }

    @Override
    Food createSoup() {
        return new Soup("Мексиканский суп", 400, 800);
    }
}
class ItallianKitchen extends KitchenFactory{

    @Override
    void getKitchenName() {
        System.out.println("---------Итальянская кухня---------");
    }

    @Override
    Food createPizza() {
        return new Pizza("Итальянская пицца", 400, 800);
    }

    @Override
    Food createSalad() {
        return new Salad("Итальянский салат", 400, 800);
    }

    @Override
    Food createSoup() {
        return new Soup("Итальянский суп", 400, 800);
    }
}

abstract class Food{ // может быть представлен интерфейсом
    int price;
    int weight;
    String name;
    abstract String getName();
}
class Pizza extends Food{
    Pizza(String n, int p, int w){
        this.name = n;
        this.price = p;
        this.weight = w;
    }
    String getName(){
        return this.name;
    }
}
class Soup extends Food{
    Soup(String n, int p, int w){
        this.name = n;
        this.price = p;
        this.weight = w;
    }
    String getName(){
        return this.name;
    }
}
class Salad extends Food{
    Salad(String n, int p, int w){
        this.name = n;
        this.price = p;
        this.weight = w;
    }
    String getName(){
        return this.name;
    }
}

