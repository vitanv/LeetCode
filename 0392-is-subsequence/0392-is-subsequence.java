class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int answer = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(answer)) answer++;
            if(answer == s.length()) return true;
        }
        return answer == s.length();
    }
}