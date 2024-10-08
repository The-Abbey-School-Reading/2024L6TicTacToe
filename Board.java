public class Board {
    public String [][] strArray = new String [3][3];

    public Board () {
    
    for (int i = 0; i < 2; i++) {
        for ( int j =  0; j < 3; j++) {
            strArray[i][j] =  "-";
        }
 }
    }
}

