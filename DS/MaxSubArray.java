package DS;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Solved using Kadane's algorithm
//Kadane's Algorithm is an iterative dynamic programming algorithm.
//It calculates the maximum sum subarray ending
//at a particular position by using the maximum sum subarray ending at the previous position.


public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a[] = {1, 3, 8, -2, 6, -8, 5};
        System.out.println(maximumSubarraySum(a));
  
	}

	private static int maximumSubarraySum(int[] a) {
		
		int n = a.length;
		int curr_sum =0;
		int max_sum = Integer.MIN_VALUE;
		
		for(int i =0; i<n; i++) {
			curr_sum+= a[i];
			
			if(curr_sum> max_sum) {
				max_sum = curr_sum;
			}
			
			if(curr_sum<0) {
				curr_sum =0;
			}
		}
		return max_sum;
	}

}
