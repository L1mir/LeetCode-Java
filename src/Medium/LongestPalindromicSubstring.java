package Medium;

//Input: s = "babad"
//Output: "bab"
//Input: s = "cbbd"
//Output: "bb
public class LongestPalindromicSubstring {
    public static String longestPalindromicSubString(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expendFromMiddle(i, i, s);
            int len2 = expendFromMiddle(i, i + 1, s);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expendFromMiddle(int left, int right, String s) {
        if (s == null || left > right) {
            return 0;
        }

        while (left >= 0  && right  < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left + 1;
    }
    //  12
    // abba

    public static void main(String[] args) {
        String s1 = "babad"; // "bab"
        String s2 = "cbbd"; // "cbbd"
        //System.out.println(longestPalindromicSubString(s1));

    }
}
