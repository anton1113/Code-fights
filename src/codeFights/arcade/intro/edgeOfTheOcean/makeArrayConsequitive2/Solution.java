package codeFights.arcade.intro.edgeOfTheOcean.makeArrayConsequitive2;

public class Solution {
    int makeArrayConsecutive2(int[] statues) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int size: statues) {
            if (size < min) {
                min = size;
            }

            if (size > max) {
                max = size;
            }
        }

        return max - min - statues.length + 1;
    }
}
