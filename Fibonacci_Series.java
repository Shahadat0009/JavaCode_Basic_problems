
package code_with_harry;


public class Fibonacci_Series {
    public static void main(String[] args) {
        int n=9;
        int n1=0;
        int n2=1;
        for(int i =0; i<=n; i++){
            System.out.print(n1+ " ");
            int next= n1+n2;
            n1=n2;
            n2=next;
        }
    }
    
}
