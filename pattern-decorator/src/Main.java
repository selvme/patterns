public class Main {

    public static void main(String[] args) {
	// write your code here
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " PRICE: $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1); // декорируем объект другим объектом декоратором
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " PRICE: $" + beverage1.cost());
    }
}
