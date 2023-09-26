
package code_with_harry;

import java.util.Scanner;
public class Code_with_harry {

    
  /*  public static void main(String[] args) {
   int age;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Age: ");
        age=sc.nextInt();
        if(age>56)
        {
           System.out.println("You are Experienced");
        }
        else if(age>46)
        {
            System.out.println("You are less Experienced");
        }
        else if(age>36)
        {
            System.out.println("You are a little Experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
        
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d", n, i, n*i);
            System.out.print("\n");
        }
    }
    
}
