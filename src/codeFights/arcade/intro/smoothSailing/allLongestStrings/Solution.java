package codeFights.arcade.intro.smoothSailing.allLongestStrings;

public class Solution {
    public static void main(String[] args) {

    }

    String[] allLongestStrings(String[] inputArray) {
        int maxLength = 0;
        for (String elem: inputArray) {
            if (elem.length() > maxLength) {
                maxLength = elem.length();
            }
        }

        int elementsWithMaxLengthCount = 0;
        for (String elem: inputArray) {
            if (elem.length() == maxLength) {
                elementsWithMaxLengthCount++;
            }
        }

        String[] results = new String[elementsWithMaxLengthCount];
        int i = 0;
        for (String elem: inputArray) {
            if (elem.length() == maxLength) {
                results[i] = elem;
                i++;
            }
        }

        return results;
    }
}
