package Easy;

//Input: s = "race a car"
//Output: false
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = cleanS.length() - 1;

        while (i < j) {
        if (cleanS.charAt(i) != cleanS.charAt(j)) {
            return false;
        }

        i++;
        j--;
        }
        return true;
    }
}
