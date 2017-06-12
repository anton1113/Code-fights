package codeFights.arcade.intro.smoothSailing.isLucky;

public class IsLucky {
    public static void main(String[] args) {

    }

    boolean isLucky(int n) {
        String numString = "" + n;
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < numString.length() / 2; i++) {
            firstHalfSum += numString.charAt(i);
            secondHalfSum += numString.charAt(numString.length() - 1 - i);
        }

        return firstHalfSum == secondHalfSum;
    }
}
