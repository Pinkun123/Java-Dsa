public class Nquuensallsolution {

    public static void ChessBoard(char board[][], int row)
    {
        // base case
        if(row == board.length)
        {
            PrintBoard(board);
            return;
            
        }

        for(int j=0;j<board.length;j++)
        {
            board[row][j]='Q';
            ChessBoard(board, row+1);
            board[row][j]='x';

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
    }
    
}
