package easy;

public class IntegerIsPalindrome {
	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int len = s.length();
		for(int i = 0,j = len-1; i < j; i++,j--) {
			if(s.charAt(i) != s.charAt(j)) return false;
		}
        return true;
    }
	public static void main(String[] args) {
		int it = -121;
		System.out.println(isPalindrome(it));
	}
}
