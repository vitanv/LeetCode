class Solution {

    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int left = 0, answer = 0;
        for (int right = 0; right < s.length(); right++) {
            int ch = s.charAt(right) - 'a';
            count[ch]++;
            while (count[ch] > 2) {
                int ch2 = s.charAt(left) - 'a';
                count[ch2]--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}