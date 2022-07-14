import java.util.Scanner;

// import java.util.Scanner;

// // public class A {
// //     public static void main(String[] args) {
// //     int a= 5 ,b= 5,sum;
    
// //     sum = a+ b;
// //         System.out.print(sum);    
// //     }
    
// // }
// public class A {
//     public static void main(String [] args) {
    
//     int x,y,sum;
    
//     Scanner sc = new Scanner(System.in);
    
//     System.out.print("Enter 1st No :- ");
    
//     x=sc.nextInt();
    
//     System.out.print("Enter 2nd No :- ");
    
//     y=sc.nextInt();
    
//     sc.close();
//         sum = x + y;
//         System.out.println("Sum of these numbers: "+sum);
//     }
    
// }

/**
 * A
 */
public class A {

    public static void main(String [] args){
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value a :- ");
    a=sc.nextInt();
    System.out.print("Enter Value b :- ");
    b=sc.nextInt();
    sc.close();
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a==b);
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a/b);
    System.out.println(a*b);

}
}