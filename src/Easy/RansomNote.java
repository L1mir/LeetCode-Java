package Easy;

import java.util.HashMap;

//Input: ransomNote = "a", magazine = "b"
//Output: false
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Input: ransomNote = "aa", magazine = "aab"
//Output: true
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (hashMap.containsKey(c) && hashMap.get(c) > 0) {
                hashMap.put(c, hashMap.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
