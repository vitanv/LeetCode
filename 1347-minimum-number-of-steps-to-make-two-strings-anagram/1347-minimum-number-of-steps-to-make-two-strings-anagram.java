class Solution {
    public int minSteps(String s, String t) {
        int answer =  0, n = s.length();
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for(int i = 0; i < n; i++){
            freqS[s.charAt(i) - 'a']++;
            freqT[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            answer += Math.abs(freqT[i] - freqS[i]);
            
        }
        return answer/2 + answer%2;
    }
}