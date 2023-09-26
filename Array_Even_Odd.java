
package code_with_harry;


public class Array_Even_Odd {
    public static void main(String[] args) {
        int [] array = {13, 3, 2, 59, 91, 11, 28};
        for(int i=0; i<=array.length; i++)
        {
            if(array[i]%2==0)
            {
                System.out.println("The value "+array[i]+ " at index "+i+" is Even number.");
            }
            else{
                System.out.println("The value "+array[i]+ " at index "+i+" is Odd number.");
            }
        }
    }
    
}
