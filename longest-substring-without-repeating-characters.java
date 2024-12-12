import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0, right = 0;
        HashSet<Character> longest = new HashSet<>();
        while (right < s.length()) {
            if (longest.contains(s.charAt(right))) {
                longest.remove(s.charAt(left));
                left++;
            } else {
                longest.add(s.charAt(right));
                right++;
                int sz = longest.size();
                ans = Math.max(ans, sz);
            }
        }
        return ans;
    }
}