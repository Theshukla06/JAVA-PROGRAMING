     //Inheritance_Example

     
class Parent{
    void bike(){
        System.out.println("Hiro");
    }
}
class Chield extends Parent{
    void cycle(){
        System.out.println("Atluse");
    }
}
public class Inheritance_Example {
    public static void main(String args []) {
        Chield c = new Chield();
        c.bike();
        c.cycle(); 
        
    }

    
}