import javax.swing.BorderFactory;

public class allsolutionchessborad {

    public static void ChessBorad(char borad[][], int row)
    {
        // base case
        if(row == borad.length)
        {
            printBorad(borad);
            return;
        }


        // recursion

        // loops for column
        for(int j=0; j<borad.length;j++)
        {
            borad[row][j]='q';
            ChessBorad(borad, row+1);
            borad[row][j]='*';

        }
    }

    public static void printBorad(char borad[][])
    {
        System.out.println("___chessborad__");
        for(int i=0;i<borad.length;i++)
        {
            for(int j=0;j<borad.length;j++)
            {
                System.out.print(borad[i][j]+" ");
            }
            System.out.println();
      
        }
    }
    public static void main(String[] args) {
        int n=2;
        char borad[][]=new char[n][n];

        // intilaization

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                borad[i][j]='*';

            }
        }

        ChessBorad(borad,0);
    }
    
}
