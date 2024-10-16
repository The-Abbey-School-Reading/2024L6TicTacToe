
public class Board {
    
    public String [][] strArr = new String [3][3];

    public Board () {
    
    for (int i = 0; i < 3; i++) {
        for ( int j =  0; j < 3; j++) {
            strArr[i][j] =  "-";
        }
      }
    }

    public void printBoard() {
        for (int i = 0; i <3; i++){
            System.out.print(strArr[i][0]+" "+strArr[i][1]+" "+strArr[i][2]+\n);
        }
    }

    public boolean makeMove(int row, int column, char Symbol){
        if (board[row-1][column-1] == "-") {      // dion updated this section basically i was thinking we could return true and then continue to next round and if false do a while loop until they choose unoccupied coordinates
            board[row-1][column-1] = Symbol;
            return true;
        } else {
            return false; }
        
    }
}

