package arcade.intro.edgeOfTheOcean.matrixElementSum;

public class Solution {
    public static void main(String[] args) {

    }

    int matrixElementsSum(int[][] matrix) {
        int sum = 0;

        for (int colIndex = 0; colIndex < matrix[0].length; colIndex++) {
            for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
                if (matrix[rowIndex][colIndex] == 0) {
                    break;
                }

                sum += matrix[rowIndex][colIndex];
            }
        }

        return sum;
    }
}
