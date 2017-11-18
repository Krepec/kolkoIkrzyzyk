import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by laptop on 17.11.17.
 */
public class App {
    static List<String> wierszX = Arrays.asList("x", "x", "x");
    static List<String> wierszO = Arrays.asList("o", "o", "o");

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


            for (int j = 0; j < 3; j++) {
                wiersz.add(board[i][j]);
                kolumna.add(board[j][i]);
                kolumna.add(board[j][j]);
            }

            if (wiersz.equals(wierszO)) {
                return true;
            } else if (wiersz.equals(wierszX)) {
                return true;
            }
            else if (kolumna.equals(wierszO)){
                return true;
            }
            else if (kolumna.equals(wierszX)){
                return true;
            }
            else if (przekatna.equals(wierszX)){
                return true;
            }
            else if (przekatna.equals(wierszO))
                return true;
        }
        return false;
    }

}
