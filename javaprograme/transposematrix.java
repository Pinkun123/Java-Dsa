import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        int n=2; // rows
        int m=2; // column
        int a[][]=new int[n][m];
        Scanner r=new  Scanner(System.in);
        System.out.print("enter matrix data:");
        for(int i=0;i<n;i++){  // for rows

            for(int j=0;j<m;j++){  // for column
                a[i][j]=r.nextInt();
            }
        }

        System.out.println("matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("transpose matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
