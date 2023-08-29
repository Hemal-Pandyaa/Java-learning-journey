import java.util.ArrayList;
import java.util.List;

public class N_Queens{

    public static void saveBoard(char Board[][], List<List<String>> Boards){
        String row = "";
        List<String> StringBoard = new ArrayList<>();
        for(int i = 0; i < Board.length; i++){
            row = "";
            for(int j = 0; j  < Board.length; j++){
                if(Board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            StringBoard.add(row);
        }
        Boards.add(StringBoard);
    }

    public static boolean isSafe(int row,int col,char Board[][]){
        // checking coloum
        for(int r = 0; r < Board.length;r++){
            if(Board[r][col] == 'Q'){
                return false;
            }
        }

        // checking row
        for(int c = 0; c < Board.length;c++){
            if(Board[row][c] == 'Q'){
                return false;
            }
        }

        // upper Right
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--, r--){
            if(Board[r][c] == 'Q'){
                return false;
            }
        }

        // lower left
        r = row;
        for(int c = col; c > Board.length && r < Board.length; c++, r++){
            if(Board[r][c] == 'Q'){
                return false;
            }
        }

        // upper left
        r = row;
        for(int c = col; c < Board.length && r >= 0; c++, r--){
            if(Board[r][c] == 'Q'){
                return false;
            }
        }

        // lower right
        r = row;
        for(int c = col; c >= 0 && r <Board.length; c--, r++){
            if(Board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }


    public static void placeCurrBoard(char currBoard[][],List<List<String>> Boards,int col){

        if(col == currBoard.length){
            saveBoard(currBoard,Boards);
            return;
        }

        for(int i = 0;i < currBoard.length; i++){
            if(isSafe(i,col,currBoard)){
                currBoard[i][col] = 'Q';
                placeCurrBoard(currBoard, Boards, col+1);
                currBoard[i][col] = '.';
            }
        }

    }


    public static List<List<String>> Queens(int n){
        // Declaring List for answer contaning all boards array of string
        List<List<String>> Boards= new ArrayList<>();
        // Current to keep the track
        char currBoard[][] = new char[n][n];
        // Another function to check for the curr board
        placeCurrBoard(currBoard, Boards,0);
        return Boards;
    }


    public static void main(String args[]){
        int n = 4;
        System.out.println(Queens(n));
    }

}