import pacote1.Dog;
import pacote2.Person;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Dog d1 = new Dog();
        Person p1 = new Person();

       System.out.println("The dog barked");

    d1.bark();

       System.out.println("The human said");

    p1.hello();

    }
}
