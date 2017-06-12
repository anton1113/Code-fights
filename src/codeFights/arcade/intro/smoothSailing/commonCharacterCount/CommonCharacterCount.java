package codeFights.arcade.intro.smoothSailing.commonCharacterCount;

import java.util.LinkedList;
import java.util.List;

public class CommonCharacterCount {
    public static void main(String[] args) {
        CommonCharacterCount runner = new CommonCharacterCount();
        int testRes1 = runner.commonCharacterCount("abba", "abcd");
        System.out.println(testRes1);
    }

    int commonCharacterCount(String s1, String s2) {
        int count = 0;
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        for (char ch: s1Char) {
            if (contains(s2Char, ch)) {
                count++;
            }
        }

        return count;
    }

    boolean contains(char[] sequence, char symbol) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == symbol) {
                sequence[i] = ' ';
                return true;
            }
        }

        return false;
    }
}
