package codeFights.challenges.minesweeper1;

/**
 * Challenge info:
 * Cost: 2000 coins.
 * Link to spec:
 * https://codefights.com/challenge/ZXRv42mfhbiTTDrEB/solutions
 *
 * @author arasshchektaiev
 */
public class Minesweeper1 {
    public static void main(String[] args) {
        int[][] arr = {{0,1,9,1,0},
        {0,1,1,1,0},
        {0,0,0,0,0}};
        System.out.println(minesweeper1(arr));
    }

    private static boolean minesweeper1(int[][] gameboard) {
        int[][] copy = new int[gameboard.length][gameboard[0].length];

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard.length; j++) {
                if (gameboard[i][j] == 9) {
                    copy[i][j] = 9;
                    incrementAdjacent(copy, i, j);
                }
            }
        }

        return arraysAreEqual(gameboard, copy);
    }

    private static void incrementAdjacent(int[][] arr, int i, int j) {
        for (int k = i -1; k < i + 2; k++) {
            for (int l = j -1; l < j + 2; l++) {
                if (k != 0 || l != 0) {
                    increment(arr, k, l);
                }
            }
        }
    }

    private static void increment(int[][] arr, int i, int j) {
        if (i > 0 && i < arr.length && j > 0 && j < arr[0].length && arr[i][j] < 9) {
            arr[i][j]++;
        }
    }

    private static boolean arraysAreEqual(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
