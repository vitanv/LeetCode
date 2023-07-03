class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        boolean duplicate = false;
        int[] freq = new int[26];
        int diff = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) - goal.charAt(i) != 0) diff++;
            freq[s.charAt(i) - 'a']++;
            if(freq[s.charAt(i) - 'a'] == 2) duplicate = true;
        }
        for(char c : goal.toCharArray()){
            if(freq[c - 'a'] > 0) freq[c - 'a']--;
        }
        for(int f: freq){
            if(f > 0) return false;
        }
        if(diff == 2 || (diff == 0) && duplicate)return true;
        return false;
    }
}