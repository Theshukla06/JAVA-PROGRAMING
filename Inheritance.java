class Addition {
    void add(int a , int b){
        System.out.println("Addition is :- "+(a+b));
    }
}

class Division extends Addition {
    void div(int a , int b){
        System.out.println("Division is :- "+(a/b));
    }
}

class Multiplication extends Division {
    void multiply(int a , int b){
        System.out.println("Multiplication is :- "+(a*b));
    }
}
class Subtraction extends Multiplication {
    void sub(int a , int b){
        System.out.println("Subtraction is :- "+(a-b));
    }
    void callallmethod(){
        add(5, 6);
        div(4,2);
        multiply(5, 5);
        sub(5, 2);
    }
}
public class Inheritance extends Subtraction {
    public static void main(String args []) {
        
    
    Subtraction s  = new Subtraction();
    s.callallmethod();

    }
}