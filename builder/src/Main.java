/**
 * Создатель - порождающий шаблон проектирования.
 * Определяет конструирование сложного объекта и его представления, так что в результате
 * одного и того же процесса могут получаться разные представления.
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        director.builderCar(new ZazCar());
        Car car = director.getMyCar();
        System.out.println(car);
    }
}

class Car{
    private String name = "";
    private int maxSpeed = 0;
    private int fuel = 0;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Модель: " +name + " Максимальная скорость: " +maxSpeed + " Объем бака: " +fuel;
    }
}

abstract class MakerCar{
    Car car;
    public void createCar(){
        car = new Car();
    }
    abstract public void setName();
    abstract public void setMaxSpeed();
    abstract public void setFuel();

    public Car getCar(){
        return car;
    }
}

class FerraryCar extends MakerCar{

    @Override
    public void setName() {
        car.setName("Ferrary F-12");
    }

    @Override
    public void setMaxSpeed() {
        car.setMaxSpeed(360);
    }

    @Override
    public void setFuel() {
        car.setFuel(60);
    }
}
class ZazCar extends MakerCar{

    @Override
    public void setName() {
        car.setName("ZAZ Chance");
    }

    @Override
    public void setMaxSpeed() {
        car.setMaxSpeed(180);
    }

    @Override
    public void setFuel() {
        car.setFuel(40);
    }
}

class Director {
    Car car;
    void builderCar(MakerCar car){
        car.createCar();
        car.setName();
        car.setMaxSpeed();
        car.setFuel();
        this.car = car.getCar();
    }
    public Car getMyCar(){
        if (car != null){
            return car;
        }
        throw new NullPointerException("Машину сначала нужно создать методом buildCar класса Director");
    }
}

//// Шаблон того что мы хотим получить - объект
//class PersonalComp{
//    private int price;
//    private String name;
//    private int performance;
//
//    void setPrice(int price) {
//        this.price = price;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    void setPerformance(int performance) {
//        this.performance = performance;
//    }
//
//    @Override
//    public String toString() {
//        return name + " " + price + " " + performance;
//    }
//}
//
//// Создатель представлений объекта - создатель представлений
//abstract class PCBuilder{
//    PersonalComp pc;
//    private String name;
//    private int price;
//    private int performance;
//
//    void createPC(){
//        pc = new PersonalComp();
//        pc.setName(name);
//        pc.setPrice(price);
//        pc.setPerformance(performance);
//    }
//    abstract void setName();
//    abstract void setPrice();
//    abstract void setPerformance();
//    PersonalComp getPC(){
//        return pc;
//    }
//}
//
//// Один из вариантов конкретного объекта - представления объекта
//class HighPC extends PCBuilder{
//
//    @Override
//    void setName() {
//        pc.setName("High Computer Performance");
//    }
//
//    @Override
//    void setPrice() {
//        pc.setPrice(500000);
//    }
//
//    @Override
//    void setPerformance() {
//        pc.setPerformance(100000000);
//    }
//}
//
//// Класс, который конструирует один из вариантов конкретного объекта - конструирование с помощью создателя
//class Director {
//    PCBuilder builder;
//
//    void setBuild(PCBuilder b) {
//        builder = b;
//    }
//
//    PersonalComp buildPC() {
//        builder.createPC();
//        builder.setName();
//        builder.setPrice();
//        builder.setPerformance();
//        return builder.getPC();
//    }
//}