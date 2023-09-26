
package code_with_harry;


public class Symmectric_Matrix_Check {
    public static void main(String[] args) {
        int [][] matrix= {{1, 2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}};
        boolean isSymmectric = true;
        for(int i=0; i<=matrix.length; i++)
        {
            for(int j=0; j<=matrix[i].length; j++)
            {
                if(matrix[i][j]!=matrix[j][i])
                {
                    isSymmectric=false;
                    break;
                }
            }
        }
        if(isSymmectric)
        {
            System.out.println("Matrix is Symmectric.");
        }
        else
        {
            System.out.println("Matrix is not Symmectric.");
        }
    }
    
}
