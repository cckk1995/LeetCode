package middle;

public class Zconvert {
	 
	 public static String convert(String s, int numRows) {
		 if(s.equals("") || s == null || numRows==1) return s;
		 int len = s.length();
		 int[][] map = new int[numRows][len];
		 int now = 0;
		 boolean down = true;
		 int x=0,y=0; 
		 map[x][y] = (int)s.charAt(now++);
		 while(now<len) {
			 if(down) {
				 if(x+1<numRows) {
					 map[x+1][y] = (int)s.charAt(now++);
					 x = x+1;
				 }
				 else {
					 down = false;
				 }
			 } else {
				 if(x-1>=0) {
					 map[x-1][y+1] = (int)s.charAt(now++);
					 x = x-1;
					 y = y+1;
				 } else {
					 down = true;
				 }
			 }
		 }
		 StringBuffer sb = new StringBuffer();
		 for(int i=0; i < numRows; i++) {
			 for(int j = 0; j <= y; j++) {
				 if(map[i][j] != 0) {
					 sb.append((char)map[i][j]);
				 }
			 }
		 }
		 return sb.toString();
	 }
	 public static void main(String[] args) {
		String s = "AB";
		int numRows = 1;
		System.out.println(convert(s,numRows));
	 }
}
