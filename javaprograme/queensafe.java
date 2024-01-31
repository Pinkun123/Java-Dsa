import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;

public class queensafe {
    public static boolean issafe(int row,int col,char[][] borad)
    {
        // herizentaly
        for(int j=0;j<borad.length;j++)
        {
            if(borad[row][j]=='Q')
            {
                return false;
            }

        }

        // for vertically
        for(int i=0;i<borad.length;i++)
        {
            if(borad[i][col]=='Q')
            {
                return false;
            }
        }

        // for uperleft

        int row=r;

        for(int col=c; r>=0 && c>=0; r--,c--)
        {
            if(borad[r][c]=='Q')
            {
                return false;
            }
        }

        // for uper right

        int row=r;

        for(int col=c;c<borad.length && r>=0;r--,c++)
        {
            if(borad[r][c]=='Q')
            {
                return false;
            }
        }


        // for lower left

        int row=r;

        for(int col=c;r<borad.length && c>=0; r++,c--)
        {
            if(borad[r][c]=='Q')
            {
                return false;
            }
        }

        // for lower right

        int row=r;

        for(int col=c;c<borad.length && r<borad.length;r++,c++)
        {
            if(borad[r][c]=='Q')
            {
                return false;
            }
        }

        return true;

    }


     public void Savevorad(char[][] borad,List<List<String>>allBorad)
     {
        String row="";

        List<String> newBoorad=new ArrayList<>();

        for(int i=0;i<borad.length;i++)
        {
            row="";

            for(int j=0;j<borad[0].length;j++)
            {
                if(borad[i][j]=='Q')
                {
                    row +="Q";
                }

                else
                {
                    row +='.';
                }
                newBoorad.add(row);
            }

            allBorad.add(newBoorad);
        }
     }

     public void helper(char[][], List<List<String>> allBoard,int col)
     {
        if(col==borad.length )
        {
            Savevorad(borad, allBoard);

            return ;
        }

        for(int row=0;row<borad.length;row++)
        {
            borad[row][col]='q';
            helper(borad,allBoard.col++);
        }
     }

      
   public List<List<String>> solveNQueens(int n) {
    List<List<String>> allBoards = new ArrayList<>();
    char[][] board = new char[n][n];
   
    helper(board, allBoards, 0);
    return allBoards;
}

}  
