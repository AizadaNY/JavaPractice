package org.example.leetcode;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        int i = maxProfit(arr);
        System.out.println(i);

    }

    public static int maxProfit ( int[] prices){
        int min = prices[0];
        int index = 0;

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                index = i;
            }
        }
        System.out.println(min);
        int max = prices[index];
        for (int i = index; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
            }
        }
        System.out.println(max);
        return max - min;
    }


}
