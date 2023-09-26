package lab3task3;
import java.util.Scanner;

public class Lab3Task3 {


    public static void main(String[] args) {
        int number, rem=0, sum=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any value between 0 to 1000: ");
        number= input.nextInt();
        
        while(number>0 && number<=1000){
         rem = number % 10;
         sum = sum + rem;
         number = number / 10; 
        }
        System.out.println(sum);

    }
    
}

