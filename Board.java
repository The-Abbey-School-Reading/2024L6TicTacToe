import java.util.Scanner;

public class Board {
    Scanner scnr = new Scanner(System.in);
    
    public String [][] strArr = new String [3][3];

    public Board () {
    
    for (int i = 0; i < 2; i++) {
        for ( int j =  0; j < 3; j++) {
            strArr[i][j] =  "-";
        }
    }

    public void printBoard() {
        for (int i = 0;i<3;i++){
            System.out.print(strArr[i][0]+" "+strArr[i][1]+" "+strArr[i][2]);
        }
    }

    System.out.println(" ");

    
}}



