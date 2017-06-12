package codeFights.arcade.intro.smoothSailing.sortByHeight;

public class SortByHeight {
    public static void main(String[] args) {
        int[] testArray = {-1, 150, 190, 170, -1, -1, -1, -1};
        SortByHeight runner = new SortByHeight();
        testArray = runner.sortByHeight(testArray);

        for (int i: testArray) {
            System.out.print(i + " ");
        }
    }

    int[] sortByHeight(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1;) {
                int tmp = 1;
                while (j + tmp < a.length && a[j + tmp] == -1) {
                    tmp++;
                }

                if (j + tmp < a.length && a[j] > a[j + tmp]) {
                    int sup = a[j];
                    a[j] = a[j + tmp];
                    a[j + tmp] = sup;
                }

                j += tmp;
            }
        }

        return a;
    }
}
