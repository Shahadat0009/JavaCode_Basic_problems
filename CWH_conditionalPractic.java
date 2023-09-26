
package code_with_harry;

import  java.util.Scanner;
public class CWH_conditionalPractic {
    
    public static void main(String[] args) {
        double physics;
        double chemistry;
        double mathematics;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics number: ");
        physics=sc.nextDouble();
        System.out.println("Enter your Chemistry number: ");
        chemistry=sc.nextDouble();
        System.out.println("Enter your  Mathematics number: ");
        mathematics=sc.nextDouble();
        
        double avg= (physics+chemistry+mathematics)/3;
        System.out.println("Your average percentage is: "+avg);
        if(avg>=40 && physics>=33 && chemistry >=33 &&  mathematics>= 33)
        {
            System.out.println("Congratulations!! Your are elligible.");
        }
        else
            System.out.println("You are not eligiblemn  ");
        
        
    }
    
}
