import java.util.Scanner;

import javax.lang.model.element.Element;

public class findkeyinmatrix {
    public static boolean findkey(int matrix[][], int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0 ;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                   
                    System.out.println("the elment is found");
                    System.out.println("At the index("+i+","+j+")");

                    return true;
                }
            }
        }

        System.out.println("the elment is not found:");
        return false;
        
       
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        

        /// for input the matrix

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();

            }
        }

        /// for out put the matrix

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+"");
            }
            System.out.println();
        }

        findkey(matrix,20);
    }
    
}
