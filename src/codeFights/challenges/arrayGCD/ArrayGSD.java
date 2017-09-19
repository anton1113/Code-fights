package codeFights.challenges.arrayGCD;

/**
 * Challenge info:
 * Cost: 2000 coins.
 * Link to spec:
 * https://codefights.com/challenge/6yLzBLYAM3kkP4P7A
 *
 * @author arasshchektaiev
 */
public class ArrayGSD {
    public static void main(String[] args) {

    }

    long arrayGCD(int[] arr, int x, int y) {
        long result = 0;

        int min = x;
        if (y < x) {
            min = y;
        }

        for (int i: arr) {
            if (i == 1) {
                result += min;
            }
        }

        return result;
    }
}
