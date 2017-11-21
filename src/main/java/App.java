import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by laptop on 17.11.17.
 */
public class App {
    static List<String> WinX = Arrays.asList("x", "x", "x");
    static List<String> WinO = Arrays.asList("o", "o", "o");


    public static void main(String[] args) {

        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-";
            }
        }
        printArray(board);
        boolean gameOver = false;
        while (!gameOver) {
            Scanner input = new Scanner(System.in);
            System.out.print("Podaj x lub o: ");
            String ox = input.next();
            System.out.println("Podaj oś x: ");
            int x = input.nextInt();
            System.out.println("Podaj oś y: ");
            int y = input.nextInt();
            board[x][y] = ox;
            printArray(board);
            gameOver = isFinish(board);

        }

    }


    static void printArray(String[][] board) {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    static boolean isFinish(String[][] board) {

        for (int i = 0; i < 3; i++) {
            List<String> wiersz = new ArrayList<String>();
            List<String> kolumna = new ArrayList<String>();
            List<String> przekatna = new ArrayList<String>();
            List<String> przekatna2 = new ArrayList<String>();
            przekatna2.add(board[0][2]);
            przekatna2.add(board[1][1]);
            przekatna2.add(board[2][0]);


            for (int j = 0; j < 3; j++) {
                wiersz.add(board[i][j]);
                kolumna.add(board[j][i]);
                przekatna.add(board[j][j]);

            }

            if (wiersz.equals(WinO)) {

                return true;
            } else if (wiersz.equals(WinX)) {

                return true;
            } else if (kolumna.equals(WinO)) {

                return true;
            } else if (kolumna.equals(WinX)) {

                return true;
            } else if (przekatna.equals(WinO)) {

                return true;
            } else if (przekatna.equals(WinX)) {

                return true;
            } else if (przekatna2.equals(WinO)) {

                return true;
            } else if (przekatna2.equals(WinX))

                return true;
        }
        return false;
    }

}
