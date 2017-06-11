package codeFights.challenges.candyCrush1;

/**
 * Challenge info:
 * Cost: 1000 coins.
 * Link to spec:
 * https://codefights.com/challenge/W54BMdin3EdbtgiPa
 *
 * @author aRasshchektaiev
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    boolean candyCrush1(char[][] gameboard) {
        boolean contains = false;

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard[0].length - 2; j++) {
                if (gameboard[i][j] == gameboard[i][j + 1] &&
                        gameboard[i][j] == gameboard[i][j + 2]) {
                    contains = true;
                }
            }
        }

        for (int i = 0; i < gameboard[0].length; i++) {
            for (int j = 0; j < gameboard.length - 2; j++) {
                if (gameboard[j][i] == gameboard[j + 1][i] &&
                        gameboard[j][i] == gameboard[j + 2][i]) {
                    contains = true;
                }
            }
        }

        return contains;
    }
}
