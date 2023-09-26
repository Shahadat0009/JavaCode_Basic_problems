
package code_with_harry;

import java.util.Scanner;
public class Array_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i=0;i<10; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int numberToSearch = sc.nextInt();
        boolean found = false;
        for(int num: arr)
        {
            if(num==numberToSearch)
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println(numberToSearch+ " is present in the Array");
        }
       else
        {
            System.out.println(numberToSearch+ " is not present in the Array");
        }
        
    }
    
}