package arcade.intro.edgeOfTheOcean.almostIncreasingSequence;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sequence = {10, 1, 2, 3, 4, 5, 1};
        System.out.println(solution.almostIncreasingSequence(sequence));
    }

    // TODO check out one more time later
    boolean almostIncreasingSequence(int[] sequence) {
        int currMax = Integer.MIN_VALUE;
        int prevMax = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] <= prevMax || sequence[i] == currMax) {
                count++;
            }

            try {
                if(sequence[i] <= sequence[i - 1]) {
                    currMax = sequence[i - 1];
                    if (i > 1) {
                        prevMax = sequence[i - 2];
                    }
                    else {
                        prevMax = sequence[i];
                    }
                    count++;
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // do nothing
            }
        }

        return count < 2;
    }
}
