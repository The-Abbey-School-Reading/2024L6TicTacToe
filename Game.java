import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        
        Scanner scanner = new Scanner(System.in); // why is there a scanner............................heh??? e-eh?!? Nani!? bro??? Issue?
        System.out.println(board);                                                         // nope
        
        String PlayerName;
        System.out.println("P1--Enter your name:");
        PlayerName = scanner.nextLine();
        Player P1 = new Player(PlayerName,'x');
        System.out.println("P2-Enter your name:");
        PlayerName = scanner.nextLine();
        Player P2 = new Player(PlayerName,'o');


        System.out.printf("%s, enter a row number: ", P1);
        int row = scnr.nextInt();
        
    }
}