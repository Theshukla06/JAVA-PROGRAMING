import java.util.Arrays;
import java.util.Scanner;

/**
 * Array_Example
 */
public class Array_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the num of values : ");
        int n = Integer.parseInt(in.nextLine().trim());
        in.nextInt();
        in.nextLine();
        
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(in.nextLine().trim());
        }

        System.out.println(Arrays.toString(array));
    }
}














//import java.util.Scanner;

// public class Array_Example {
//     public static void main(String args []) {
//         int n;
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter Array Element Store  :- ");
//         n=s.nextInt();
//         int[]array=new int[5];
//         System.out.println("Enter Array Element :- ");
//         s.close();
        
//         for (int i = 0; i < n; i++) {
//         array[i]=s.nextInt();
        
//     }
//     System.out.println("Array Elements are :- ");
//     for (int i = 0; i < n; i++) {
//         System.out.println(array[i]);
        
//     }
//   }
    
// }