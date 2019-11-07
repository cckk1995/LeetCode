package middle;

import java.math.BigInteger;

public class MyAtoi {
	public static int myAtoi(String str) {
		if(str.equals("")|| str.equals("-") || str.equals("+") || str == null) return 0;
		StringBuffer sb = new StringBuffer();
		int i = 0;
		boolean flag = false;
		while(i<str.length() && str.charAt(i) == ' ') i++;
		str = str.substring(i);
		int len = str.length();
		if(len == 0) return 0;
		for(i = 0; i < len; i++) {
			char c = str.charAt(i);
			if(flag) {
				if(c<='9' && c>='0') {
					sb.append(c);
				} else {
					if((str.charAt(0)=='+' || str.charAt(0)=='-')&&i==1) return 0;
					break;
				}
			} else {
				if(i==0 && (c=='-'||c=='+')) {
					sb.append(c);
					flag = true;
				} else if(c<='9' && c>='0') {
					sb.append(c);
					flag = true;
				} else {
					return 0;
				}
			}
		}
		BigInteger up = BigInteger.valueOf((long)(Math.pow(2,31)) - 1);
		BigInteger down = BigInteger.valueOf(-1 * (long)(Math.pow(2,31)));
        BigInteger bg = new BigInteger(sb.toString());
        if(bg.compareTo(up)>0) return Integer.valueOf(up.toString());
        else if(bg.compareTo(down)<0) return Integer.valueOf(down.toString());
        else return Integer.valueOf(bg.toString());
    }
	public static void main(String[] args) {
		String s = "-";
		System.out.println(myAtoi(s));
	}
}