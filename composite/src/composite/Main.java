/**
 * Компановщик - структурный шаблон проектирования
 * Объединяющий объекты в древовидную структуру для представления иерархии от частного к целому.
 * Компановщик позволяет обращаться клиентам к отдельным объектам и группам объектов одинаково.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Composite composite = new Composite();
        Rose rose = new Rose();
        Rose rose1 = new Rose();
        Tulpan tulpan = new Tulpan();
        composite.addComponent(rose);
        composite.addComponent(rose1);
        composite.addComponent(tulpan);
        composite.getName();
        composite.removeComponent(rose1);
        System.out.println("-------------------------------");
        composite.getName();
    }
}
interface Flowers{
    void getName();
}
class Rose implements Flowers{

    @Override
    public void getName() {
        System.out.println("Роза");
    }
}
class Tulpan implements Flowers{

    @Override
    public void getName() {
        System.out.println("Тюльпан");
    }
}
class Composite implements Flowers{

    private List<Flowers> components = new ArrayList<>();
    public void addComponent(Flowers component){
        components.add(component);
    }
    public void removeComponent(Flowers component){
        components.remove(component);
    }

    @Override
    public void getName() {
        for (Flowers comonent: components) {
            comonent.getName();
        }
    }
}