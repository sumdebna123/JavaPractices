package com.leedcode.prac.test;

public class TimeTobuySellStock {
	public static void main(String[] args) {
		int[] array = {7,1,5,3,6,4};
		System.out.println(getMaxProfit(array));
	}
	
	public static int getMaxProfit(int[] prices) {
		int firstValue = prices[0];
		int profit=0;
		for (int i=1;i<prices.length;i++) {
			if (prices[i]>firstValue) {
				profit=profit+(prices[i]-firstValue);
			}
			firstValue=prices[i];
		}
		return profit;

	}

}
