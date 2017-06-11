package codeFights.challenges.candyCrush3;

/**
 * Challenge info:
 * Cost: 2000 coins.
 * Link to spec:
 * https://codefights.com/challenge/Bj4AAcrgFQZPv58uW
 *
 * @author aRasshchektaiev
 */
public class Solution {
    public static void main(String[] args) {

    }

    // TODO solve this task
    boolean candyCrush3(char[][] gameboard) {
        boolean playable = false;

        for (int i = 0; i < gameboard.length; i++) {
            for (int j = 0; j < gameboard.length; j++) {
                int[] cell = {i, j};
                char[] directions = {'U', 'D', 'L', 'R'};

                for (int d = 0; d < directions.length; d++) {
                    if (candyCrush2(gameboard, cell, directions[d])) {
                        playable = true;
                    }
                }
            }
        }

        return playable;
    }

    boolean candyCrush2(char[][] gameboard, int[] cell, char direction) {
        swap(gameboard, cell, direction);
        return candyCrush1(gameboard);
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

    void swap(char[][] gameboard, int[] cell, char direction) {
        int xBias = 0;
        int yBias = 0;

        switch (direction) {
            case 'U': {
                xBias = 0;
                yBias = -1;
                break;
            }
            case 'D': {
                xBias = 0;
                yBias = 1;
                break;
            }
            case 'R': {
                xBias = 1;
                yBias = 0;
                break;
            }
            case 'L': {
                xBias = -1;
                yBias = 0;
                break;
            }
            default: {
                // should not be thrown in this challenge
                throw new IllegalArgumentException
                        ("Possible direction values: 'D', 'U', 'L', 'R' ");
            }
        }

        char tmp = gameboard[cell[0]][cell[1]];
        try {
            gameboard[cell[0]][cell[1]] = gameboard[cell[0] + yBias][cell[1] + xBias];
            gameboard[cell[0] + yBias][cell[1] + xBias] = tmp;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            // do nothing
        }
    }
}
