package javapractice;

public class Count012 {
	public static void main(String s[]) {
	//	int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		//int n = arr.length;
	//	count(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		//for (int i=0; i<n; i++)
		//System.out.print(arr[i]+" ");
		
		
		String str = "welcome";
        char temp = 0;

        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
	}

	private static void count(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i = 0, cnt1 = 0, cnt2 = 0, cnt0 = 0;
		
		for(i = 0; i <n; i++) {
			switch(arr[i]) {
				case 0:
					cnt0++;
					break;
				case 1:
					cnt1++;
					break;
				case 2:
					cnt2++;
					break;
			}
		}
		i = 0;
		
		while(cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}
		
		while(cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}
		
		while(cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
		}
		
		
	}
}
