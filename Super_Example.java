public class Super_Example {
    int a = 10;
}
class B extends Super_Example {
    int a = 20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
    
}
class Test {
    public static void main(String args []) {
        B r= new B();
        r.show();
        
    }
}
