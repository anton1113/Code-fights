package codeFights.challenges.nav;

/**
 * Challenge info:
 * Cost: 1000 coins.
 * Link to spec:
 * https://codefights.com/challenge/CBiayArRfZEyDDGX8
 * Reverse challenge
 *
 * @author aRasshchektaiev
 */
public class Solution {
    public static void main(String[] args) {

    }

    int[] Nav(String d) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < d.length(); i++) {
            char curr = d.charAt(i);

            switch (curr) {
                case '^': {
                    count1--;
                    break;
                }
                case 'v': {
                    count1++;
                    break;
                }
                case '<': {
                    count2--;
                    break;
                }
                case '>': {
                    count2++;
                    break;
                }
                case '-': {
                    count3--;
                    break;
                }
                case '+': {
                    count3++;
                    break;
                }
                default: {
                    // should be never thrown in this challenge
                    throw new IllegalArgumentException("Invalid symbol!");
                }
            }
        }

        int[] result = {count1, count2, count3};
        return result;
    }
}
