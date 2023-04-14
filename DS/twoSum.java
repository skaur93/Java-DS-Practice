package DS;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 0, -1, 2, -3, 1 };
		int x = -2;
		int size = A.length;

		//Brute force  0(n*2)

		int a[] = chkPair(A, size, x);
		System.out.println(Arrays.toString(a));


		//hashmap  0(n)
		int b[] = findSum(A, size, x);
		System.out.println(Arrays.toString(b));
	}

	//brute force
	private static int[] chkPair(int[] a, int size, int x) {

		for(int i = 0; i<size; i++) {
			for(int j = i+1; j<size; j++) {
				if(a[i] + a[j] ==x) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}


	private static int[] findSum(int[] a, int size, int x) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<size; i++) {
			int complement = x- a[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			} else {
				map.put(a[i], i);
			}
		}
		return new int[] {};
	}
}
