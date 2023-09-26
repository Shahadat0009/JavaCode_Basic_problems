
package code_with_harry;

import java.util.Scanner;
public class CWH_Star_Pattern_Reverse_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
    
}
