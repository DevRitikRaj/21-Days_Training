 class Solution {

    public static boolean isSafe(char board[][],int row, int col){


        // vertical left
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal

        for(int i=row-1 , j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //Right

        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return  true;
    }

    static int count=0;


    public static void nQueen(char board[][],int row){
        

        //Base
        if(row==board.length){
            printBoard(board);
            count++;
            
            return;
            
        }
        

        // Column Loop

        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueen(board, row+1);
                board[row][j]='.';

            }
           
                      
        }
    }

    public static void printBoard(char board[][]){
       
        System.out.println("----------------Chess Board=================");
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
               
            }
            System.out.println();
            
        }
    }


    public static void main(String [] args){
        int n=4;
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='*';
            }
        }

        nQueen(board, 0);
        System.out.println("The number of ways is "+count);

    }   


    
}