/**
 * Created by Admin on 19.09.2017.
 */
public abstract class Duck {

    private String name = "";
    private int weight = 0;
    private int age = 0;
    private static int numberPopulation = 0;
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    Duck(String name, int age, int weight, QuackBehavior quack, FlyBehavior fly){
        this.name = name;
        this.weight = weight;
        this.age = age;
        quackBehavior = quack;
        flyBehavior = fly;
        Duck.numberPopulation++;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    public int getNumberPopulation(){
        return Duck.numberPopulation;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setWeight(int weight){
        this.weight = weight;
    }

    void setQuackBehavior(QuackBehavior behavior){
        quackBehavior = behavior;
    }

    void setFlyBehavior(FlyBehavior behavior){
        flyBehavior = behavior;
    }

    void performFly(){
        flyBehavior.fly();
    }

    void performQuack(){
        quackBehavior.quack();
    }

    void swim(){
        System.out.println("I'm swim!!!");
    }

    abstract void display();
}
