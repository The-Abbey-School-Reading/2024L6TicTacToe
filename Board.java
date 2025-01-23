
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
            System.out.print(strArr[i][0]+" "+strArr[i][1]+" "+strArr[i][2]+"\n");
        }
    }
    public Boolean haswon() {
        for (int i = 0; i < 3; i++) {
            //check x win
            if (strArr[i][0] == strArr[i][1] && strArr[i][0] == strArr[i][2] && strArr[i][0] != "-") {
                return true;
            } else if (strArr[0][i] == strArr[1][i] && strArr[0][i] == strArr[2][i] && strArr[0][i] != "-") {
                return true;
            }
        }
            if (strArr[0][0]==strArr[1][1] && strArr[1][1]==strArr[2][2] && strArr[0][0]!= "-"){
                return true;
            }
            else if (strArr[2][0]==strArr[1][1] && strArr[1][1]==strArr[0][2] && strArr[2][0]!= "-"){
                return true;
            }
            return false;



    }

    // board is the object of Board class - I think you want to change strArr the 2D Array attribute for the class
    public boolean makeMove(int row, int column, String symbol){
        if (strArr[row-1][column-1] == "-") {      // dion updated this section basically i was thinking we could return true and then continue to next round and if false do a while loop until they choose unoccupied coordinates
            strArr[row-1][column-1]= symbol;
            return true;
        } else {
            return false; }
        
    }
}

