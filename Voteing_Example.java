import java.util.Scanner;

public class Voteing_Example {
    public static void main(String args []) {
        
        int age;
        
        System.out.println("Enetr Your Age :- ");
        Scanner s = new Scanner(System.in);

        age = s.nextInt();
        s.close();

        if (age >= 18) {
            System.out.println("You Have Give Vote");
            
        } else {
            System.out.println("Sorry You dont Give Vote");
        }

        
    }
    
}
