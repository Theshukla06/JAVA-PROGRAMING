import java.util.*;

public class ArrayClass {
    public static void main(String [] args){
        int a[] = new int [5];
        System.out.print("Enter Array Element :- ");
        Scanner S= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i]=S.nextInt();
        }
        System.out.print("Array Element :- ");
        for(int b:a)
        {
            System.out.print(b+" ");
        }
    }
}
