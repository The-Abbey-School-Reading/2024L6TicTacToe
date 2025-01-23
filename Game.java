import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();


        Scanner scanner = new Scanner(System.in);
        board.printBoard();

        String PlayerName;

        System.out.println("P1--Enter your name: ");
        PlayerName = scanner.nextLine();
        Player P1 = new Player(PlayerName, "x");
        System.out.println("P2--Enter your name: ");
        PlayerName = scanner.nextLine();
        Player P2 = new Player(PlayerName, "o");

        //Boolean winner = false;
        //Player 1's turn
        int Count = 0;
            while (!board.haswon()) {
                System.out.println(P1.name + " enter a row number: ");
                int row = scanner.nextInt();
                System.out.println(P1.name + " enter a column number: ");
                int column = scanner.nextInt();

                while (board.strArr[row - 1][column - 1] != "-") {
                    System.out.println("Try Again");
                    System.out.println(P1.name + " enter a row number: ");
                    row = scanner.nextInt();
                    System.out.println(P1.name + " enter a column number: ");
                    column = scanner.nextInt();
                }
                if (board.makeMove(row, column, P1.symbol)) {
                    Count++;
                    board.printBoard();
                    if (board.haswon()) {
                        System.out.println("\n" + P1.name + " wins");
                        break;
                    }
                }
                if (Count ==9){
                    System.out.println("It was a tie");
                    break;
                }
                //Player 2's turn
                System.out.println(P2.name + " enter a row number: ");
                row = scanner.nextInt();
                System.out.println(P2.name + " enter a column number: ");
                column = scanner.nextInt();

                while (board.strArr[row - 1][column - 1] != "-") {
                    System.out.println("Try again");
                    System.out.println(P2.name + " enter a row number: ");
                    row = scanner.nextInt();
                    System.out.println(P2.name + " enter a column number: ");
                    column = scanner.nextInt();
                }

                if (board.makeMove(row, column, P2.symbol)) {    // dion updated by calling method
                    Count++;
                    board.printBoard();
                    if (board.haswon()) {
                        System.out.println("\n" + P2.name + " wins");
                        break;


                    }
                }

            }

        }
    }


