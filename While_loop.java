import java.util.Scanner;

public class While_loop {
    public static void main(String args []) {
        int num ;
        
        System.out.print("Enter a no to check even or odd :-");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        s.close();

        while (num >=0) {
            if (num %2==0) {
                System.out.println("*******Number Is Even*******");
                break;}
                else{
                    System.out.println("******Number Is Odd*****");
                    break;
            }
            
        }
        
    }
    
}
