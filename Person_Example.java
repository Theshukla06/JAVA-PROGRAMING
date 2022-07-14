public class Person_Example {
    String Name = "Ankit Shukla";
    int Age = 22;
    String color = "Black";
    int Weight = 78;

void eat(){
    System.out.println("I'am Eating");
}
void sleep(){
    System.out.println("I'am Sleeping");
}
public static void main(String args []) {
    Person p = new Person();
    System.out.println("Your Name :- "+p.name);
    System.out.println("Your Age :-  "+p.age);
    System.out.println("Your Color :-"+p.color);
    System.out.println("Your Weight :-"+p.weight);
    

    
}    
}
