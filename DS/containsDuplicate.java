package DS;

import java.util.HashSet;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,2,8};
		
		//brute force 0(n*2)
		System.out.println(containsDuplicate(nums));
		
		//hashset o(1) complexity to search and adding element is o(1) in hashset
		System.out.println(containsDuplicateSet(nums));
	}

	private static boolean containsDuplicate(int[] nums) {
		if(nums==null || nums.length ==0) {
			return false;
		}
		
		for(int i=0; i<nums.length;i++) {
			for(int j = i+1; j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;
	}

	
	private static boolean containsDuplicateSet(int[] nums) {
		if(nums==null || nums.length ==0) {
			return false;
		}
		HashSet set = new HashSet<>();
		
		for(int i=0; i<nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;
			} 
			set.add(nums[i]);
		}
		return false;
	}
}
