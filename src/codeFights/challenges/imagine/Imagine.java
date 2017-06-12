package codeFights.challenges.imagine;

/**
 * Challenge info:
 * Cost: 1000 coins.
 * Link to spec:
 * https://codefights.com/challenge/vwrjaSzc2egE3FiYf
 *
 * @author aRasshchektaiev
 */
public class Imagine {
    public static void main(String[] args) {

    }

    int[] imagine(int a, int b, int c, int d) {
        int[] result = {a * c - b * d, a * d + c * b};
        return result;
    }
}
