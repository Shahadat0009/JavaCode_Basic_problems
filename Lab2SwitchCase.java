
package lab.pkg2.pkgswitch.pkgcase;
import java.util.Scanner;
public class Lab2SwitchCase {

    
    public static void main(String[] args) {
        int num;
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        switch(num%2){
            case 0:
                System.out.println("The number is even");
                break;
            case 1:
                System.out.println("The number is odd ");
                
            
        }
    
    }
    
}
