import java.util.Scanner;

// import java.util.Scanner;

// public class Student {
//     public static void main(String [] args){
//         int num;
//         System.out.println("Enter Any Number :- ");
//         Scanner s = new Scanner(System.in);

//         num = s.nextInt();
//         s.close();

//         for(int i=1 ; i<=10 ; i++){
//             System.out.printf("%d * %d = %d \n",num,i,num*i);
//         }
//     }
    
// }

/**
 * Student
 */
public class Student {

    public static void main(String [] args) {
        int n;
        System.out.print("Enter a no :- ");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        s.close();
        for(int i=1 ; i <=n ; i++){
            System.out.println(i);
        }
        
    }
}