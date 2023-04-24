package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array nums,
//return all the triplets [nums[i], nums[j], nums[k]] 
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.

public class threeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]  = {-1,0,1,2,-1,-4};

		System.out.println(threesum(nums));
	}

	public static List<List<Integer>> threesum(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();

		//sort
		Arrays.sort(nums);

		for(int i =0; i<nums.length-2;i++) {
			if(i==0 || (i>0 && nums[i] != nums[i-1])) {
				int low = i+1;
				int high = nums.length-1;
				while(low<high) {
					int sum = nums[low] + nums[high];
					if(nums[i] + sum == 0) {
						list.add(Arrays.asList(nums[i], nums[low], nums[high]));
						
						//these 2 lines, to avoid duplicate values to avoid [-2,0,0,2,2]
						//getting this anser [[-2,0,2],[-2,0,2]]
						while(low<high && nums[low] == nums[low+1]) low++;
						while(low<high && nums[high] == nums[high-1]) high--;

						low++;
						high--;
					} else if(sum> -nums[i]) {
						high--;
					} else if(sum<-nums[i]) {
						low++;
					}
				}
			}

			}
			
		return new ArrayList<>(list);

	}
}
