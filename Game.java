import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        
        Scanner scanner = new Scanner(System.in); //why is there a scanner
        System.out.println(board);
        scanner.close();
        
        
    }
}