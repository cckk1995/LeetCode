package middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfLongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
        int ans = -1;
        int len = 0,i,j;
        Map<Character,Integer> map = new HashMap<>();
        for(i = 0; i < s.length(); i++) {
        	map.clear();
        	map.put(s.charAt(i), 1);
        	len = 0;
        	for(j = i+1; j < s.length(); j++) {
        		if(!map.containsKey(s.charAt(j))) {
        			map.put(s.charAt(j),1);
        		} else {
        			len = j-i;
        			break;
        		}
        	}
        	if(j == s.length()) len = s.length() - i;
        	if(ans < len) ans = len;
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			System.out.println(lengthOfLongestSubstring(s));
		}	
		sc.close();
	}
}
