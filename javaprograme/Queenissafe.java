public class Queenissafe {
    public static boolean IsSafe(char board[][],int row,int col)
    {
        // virtically up
        for(int i=row-1; i>=0; i--)
        {
           if(board[i][col]=='Q')
           {
               return false;
           }
        }

        // digonally left up

        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        // digonally right up

        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        return true;

    }
    public static void ChessBoard(char board[][], int row)
    {
        // base case
        if(row == board.length)
        {
            // PrintBoard(board);
            count++;
            return;
            
        }

        for(int j=0;j<board.length;j++)
        {
           if(IsSafe(board,row,j))
           {
            board[row][j]='Q';
            ChessBoard(board, row+1);  // function call
            board[row][j]='x';  // back tracking

           }
          
        }
    }

    public static void PrintBoard(char board [][])
    {
        System.out.println("___chesboard___");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+"");
            }
            System.out.println();
        }
    }

    static int count=0;
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];

        // intilization
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='x';

            }
        }
        ChessBoard(board,0);
        System.out.println("total no of ways is:"+count);
    }   
    
}
