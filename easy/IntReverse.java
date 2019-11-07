package easy;

public class IntReverse {
	public static int reverse(int x) {
		long up = (long)Math.pow(2, 31) - 1;
		long down = -1 * (long)Math.pow(2,31);
		long temp = x;
        int flag = 1;
        if(x<0) {
        	flag = -1;
        	temp = Math.abs(temp);
        }
        String s = String.valueOf(temp);
        StringBuffer sb = new StringBuffer(s);
        s = sb.reverse().toString();
        long ans = Long.valueOf(s);
        if(ans < down || ans > up) return 0;
        else return (int)(ans * flag);
    }
	public static void main(String[] args) {
		int x = 123456999;
		System.out.println(reverse(x));
	}
}
