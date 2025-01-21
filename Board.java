
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
    public Boolean winner() {
        for (int i = 0; i < 3; i++) {
            //check x win
            if (strArr[i][0] == "x" && strArr[i][1] == "x" && strArr[i][2] == "x") {
                Boolean winner = true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (strArr[0][j] == "x" && strArr[1][j] == "x" && strArr[2][j] == "x") {
                Boolean winner = true;
            }
        }
        for (int z = 0; z < 3; z++) {
            if (strArr[z][z] == "x" && strArr[z][z] == "x" && strArr[z][z] == "x") {
                Boolean winner = true;
            }

        }
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

