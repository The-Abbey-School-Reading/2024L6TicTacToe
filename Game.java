import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        
        
        Scanner scanner = new Scanner(System.in);
        board.printBoard();
        
        String PlayerName;
        
        System.out.println("P1--Enter your name: ");
        PlayerName = scanner.nextLine();
        Player P1 = new Player(PlayerName,'x');
        System.out.println("P2--Enter your name: ");
        PlayerName = scanner.nextLine();
        Player P2 = new Player(PlayerName,'o');

        //String winner = null;
        //while (winner == null){
                System.out.println(P1.name+ " enter a row number: ");
                int row = scanner.nextInt();
                System.out.println(P1.name+ " enter a row number: ");
                int column = scanner.nextInt();


                if (board.makeMove(row, column, P1.symbol)){    // dion updated by calling method
                    board.printBoard();
                }//else{
                    //System.out.println("This spot is already taken. Please try again");
                //}   //d do a while loop here


        //}

        
        
    }
}
