package codeFights.challenges.nextSquare;

/**
 * Challenge info:
 * Cost: 1000 coins.
 * Link to spec:
 * https://codefights.com/challenge/DCMvQpeqXo3EjPjG3
 *
 * @author aRasshchektaiev
 */
public class Solution {
    public static void main(String[] args) {

    }

    int nextSquare(int n) {
        int i = 0;
        while (i * i <= n) {
            i++;
        }

        return i*i;
    }
}
