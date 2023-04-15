package DS;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = "gram".toCharArray();
	    char str2[] = "arm".toCharArray();
	    
	    //o(n)
	    System.out.println(areAnagram(str1, str2));
	    
	    
	}

	static boolean areAnagram(char[] str1, char[] str2) {
		if(str1.length != str2.length) return false;
		
		int count[] = new int[256];
		
		for(int i=0; i<str1.length; i++) {
			count[str1[i]]++;
		}
		
		for(int i=0; i<str2.length; i++) {
			count[str2[i]]--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
