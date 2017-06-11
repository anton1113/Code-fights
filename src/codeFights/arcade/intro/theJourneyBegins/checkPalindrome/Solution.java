package codeFights.arcade.intro.theJourneyBegins.checkPalindrome;

public class Solution {
    boolean checkPalindrome(String inputString) {
        boolean isPalindrome = true;

        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}
