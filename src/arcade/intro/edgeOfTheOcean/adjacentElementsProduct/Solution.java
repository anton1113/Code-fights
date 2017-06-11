package arcade.intro.edgeOfTheOcean.adjacentElementsProduct;

public class Solution {
    int adjacentElementsProduct(int[] inputArray) {
        int largestProduct = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int currentProduct = inputArray[i] * inputArray[i + 1];
            if (currentProduct > largestProduct) {
                largestProduct = currentProduct;
            }
        }

        return largestProduct;
    }
}
