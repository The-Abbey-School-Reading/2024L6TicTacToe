import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(board);
        
        String PlayerName;
        
        System.out.println("P1--Enter your name: ");
        PlayerName = scanner.nextLine();
        Player P1 = new Player(PlayerName,'x');
        System.out.println("P2--Enter your name: ");
        PlayerName = scanner.nextLine();
        Player P2 = new Player(PlayerName,'o');


        System.out.printf("%s, enter a row number: ", P1);
        int row = scanner.nextInt();
        
    }
}