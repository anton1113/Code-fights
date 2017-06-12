package codeFights.arcade.intro.smoothSailing.reverseParentheses;

public class ReverseParentheses {
    public static void main(String[] args) {
        ReverseParentheses runner = new ReverseParentheses();
        System.out.println(runner.reverseParentheses("a(bc)de"));
    }

    // TODO finish later using Stack
    String reverseParentheses(String s) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(') {
                resultBuilder.append(s.charAt(i));
            }
            else {
                StringBuilder currWord = new StringBuilder();
                i++;
                while (s.charAt(i) != ')') {
                    currWord.append(s.charAt(i++));
                }
                currWord.reverse();
                System.out.println(currWord);
                resultBuilder.append(currWord);
            }
        }

        return resultBuilder.toString();
    }
}
