package DS;

import java.util.Arrays;

//Given an integer array nums, return an array answer such that answer[i] is 
//		equal to the product of all the elements of nums except nums[i].

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductOfArray pa = new ProductOfArray();
		int arr[] = { 10, 3, 5, 6, 2 };
		System.out.println("The product array is : ");
		int ar[] =pa.productItself(arr);
		System.out.println(Arrays.toString(ar));
	}

	public int[] productItself(int[] nums) {
		int n = nums.length;
		int output[] = new int[n];
		
		output[0] =1;
		for(int i =1; i<n ;i++) {
			output[i] = nums[i-1] * output[i-1];
		}

		int r =1;

		for(int i = n-1; i>=0; i--) {
			output[i] = r* output[i];
			r= r*nums[i];
		}

		return output;
	}
}
