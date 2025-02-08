package Array_Medium;

import java.util.*;

public class Tuplewith_Same_Product {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productMap = new HashMap<>();
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            }
        }

        for (int freq : productMap.values()) {
            if (freq > 1) {
                count += 8 * (freq * (freq - 1) / 2);
            }
        }

        return count;
    }

    public static void main(String[] args) {
    	Tuplewith_Same_Product solver = new Tuplewith_Same_Product();
        System.out.println(solver.tupleSameProduct(new int[]{2, 3, 4, 6})); 
        System.out.println(solver.tupleSameProduct(new int[]{1, 2, 4, 5, 10})); 
    }
}
