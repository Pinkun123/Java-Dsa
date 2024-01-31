public class SudokuSolver {
    public static boolean isSafe(int sudok[][],int row, int col,int digit)
    {
        // for column
        for(int i=0;i<=8;i++)
        {
            if(sudok[i][col]==digit)
            {
                return false;
            }
        }

        // for row
        for(int j=0;j<=8; j++)
        {
            if(sudok[row][j]== digit)
            {
                return false;
            }
        }

        // for grid
        int Sr=(row/3)*3;     // sr= strating row for 3*3 grid
        int Sc= (col/3)*3;    // sc= strating col for 3*3 grid
        for(int i=Sr; i<Sr+3;i++)
        {
            for(int j=Sc; j<Sc+3; j++)
            {
                if(sudok[i][j]==digit)
                {
                    return false;
                }

            }
        }
        return true;
    }
    public static boolean SudokSolve(int sudok[][],int row,int col)
    {
        // base case
        if(row==9)
        {
            return true;
        }

        // recursion
        int nextRow=row, nextCol=col+1;
        if(col+1==9)
        {
            nextRow=row+1;
            nextCol=0;
        }
        if( sudok[row][col]!=0)
        {
            return SudokSolve(sudok, nextRow, nextCol);
        }
        for(int digit=0; digit<=9; digit++)
        {
            if  (isSafe(sudok,row,col,digit))
            {
                sudok[row][col]=digit;
                if(SudokSolve(sudok, nextRow, nextCol)){ // soluton exist
                    return true;
                }
                sudok[row][col]=0;
            }
        }
        return false;
    }
    public static void printsudok(int sudok[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(sudok[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudok[][]={{0,0,8,0,0,0,0,0,0},
                       {4,9,0,1,5,7,0,0,2},
                       {0,0,3,0,0,4,1,9,0},
                       {1,8,5,0,6,0,0,2,0},
                       {0,0,0,0,2,0,0,6,0},
                       {9,6,0,4,0,5,3,0,0},
                       {0,3,0,0,7,2,0,0,4},
                       {0,4,9,0,3,0,0,5,7},
                       {8,2,7,0,0,9,0,1,3}};
        if(SudokSolve(sudok, 0, 0)){
            System.out.println("solution is exist");
            printsudok(sudok);
        } 
        else
        {
            System.out.println("solution does not exist");
        }              
    }
    
}
