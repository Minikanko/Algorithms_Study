package Dynamic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1. 
 * Example 1: 
 * Input: coins = [1, 2, 5], amount = 11 
 * Output: 3 
 * Explanation: 11 = 5 + 5 + 1
 */
public class CoinChange {
	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}

	private static int coinChange(int[] coins, int amount) {
		int count=0;
		
	
		return count;
	}
}
