//Метод делегирования исполнения другому экземпляру класса или интерфейса или методу.

public class Main {

    public static void main(String[] args) {
        System.out.println("РЕАЛИЗАЦИЯ ПАТТЕРНА ДЕЛЕГИРОВАНИЕ");
        A a = new A();
        B b = new B();

        a.print();
        b.print();
        System.out.println("----------------------------------------");

//
        Sheet sheet = new Sheet("Привет я листок");
        Printerable printer = new OfficePrinter();
        printer.print(sheet);
        System.out.println("РЕАЛИЗАЦИЯ ПАТТЕРНА ДЕЛЕГИРОВАНИЕ");
    }
}
// Делегируем выполнение вывода sout другому экземпляру класса.
class A {
    void print(){
        System.out.println("Печатает Класс А");
    }
}
class B {
    A a = new A();
    void print(){
        a.print();
    }
}

// Делегируем выполнение печати, самой печати, через интерфейс принтера.
class Sheet {
    final private String abc;
    Sheet(String abc){
        this.abc = abc;
    }

    @Override
    public String toString() {
        return abc;
    }
}

interface Printerable {
    void print(Sheet s);
}
class OfficePrinter implements Printerable{

    @Override
    public void print(Sheet s) {
        System.out.printf("Печать принтером OfficePrinter, с реализацией интерфейса печати Printerable строку:\n%s\n", s);
    }
}