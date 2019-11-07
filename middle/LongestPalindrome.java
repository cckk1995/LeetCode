package test;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) {
            return s;
        }
        int longestPalindrome = 1;
        String longestPalindromeStr = s.substring(0, 1);
        boolean[][] dp = new boolean[len][len];
        // abcdedcba
        //   l   r
        // ��� dp[l, r] = true ��ô dp[l + 1, r - 1] Ҳһ��Ϊ true
        // �ؼ������[l + 1, r - 1] һ�������� 2 ��Ԫ�ز����жϵı�Ҫ
        // ��Ϊ��� [l + 1, r - 1] ֻ��һ��Ԫ�أ������жϣ�һ���ǻ��Ĵ�
        // ��� [l + 1, r - 1] ��ʾ������Ϊ�գ������жϣ�Ҳһ���ǻ��Ĵ�
        // [l + 1, r - 1] һ�������� 2 ��Ԫ�� �ȼ��� l + 1 < r - 1���� r - l >  2

        // д�����ʱ������д����� [l + 1, r - 1]  ��Ԫ��С�ڵ��� 1 ������ r - l <=  2 ���Ͳ������ж���

        // ��Ϊֻ�� 1 ���ַ���������ʼ�����ж�
        // ��߽�һ��Ҫ���ұ߽�С������ұ߽�� 1 ��ʼ
        for (int r = 1; r < len; r++) {
            for (int l = 0; l < r; l++) {
                // ����Ӧ�������Ŵ�
                // ״̬ת�Ʒ��̣����ͷβ�ַ���Ȳ����м�Ҳ�ǻ���
                // ��ͷβ�ַ���ȵ�ǰ���£���������Ժ󲻹������䣨���ֻ�� 1 ��Ԫ�أ���ֱ�ӷ��� True ����
                // ����Ҫ�����������Ժ������Ļ�����
                // �ص���� or �Ķ�·���������������
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > longestPalindrome) {
                        longestPalindrome = r - l + 1;
                        longestPalindromeStr = s.substring(l, r + 1);
                    }
                }
            }
        }
        return longestPalindromeStr;
    }
	public static void main(String[] args) {
		String s = "aacbdfcaa";

		System.out.println(longestPalindrome(s));
	}

}
