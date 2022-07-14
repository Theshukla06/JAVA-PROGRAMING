public class Person {
    String name = "Ankit Shukla";
    int age = 22;
    int weight = 70;
    String color = "Black";

    void eat()
    {
        System.out .println("I'am Eating");
    }
    
    void sleep()
    {
        System.out .println("I'am Eating");
    }
    public static void main(String[] args)
    { 
        Person P = new Person();
        System.out.println(P.name);
        System.out.println(P.age);
        System.out.println(P.weight);
        System.out.println(P.color);
        
        P.eat(); P.sleep();
    }
    
}
