class A {
    int a; String b; boolean c;
    A(){
        a=1000; b="Ankit"; c=true;
    }
    void Disp(){
        System.out.print(a+" "+b+" "+c);
    }
    class B{
        public static void main(String [] args){ 
        A r=new A();
        r.Disp();
    }
}
