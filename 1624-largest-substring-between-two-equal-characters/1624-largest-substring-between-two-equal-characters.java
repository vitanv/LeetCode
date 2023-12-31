class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int answer = -1;
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);
        for(int i = 0; i < s.length();i++){
            if(first[s.charAt(i) - 'a'] == -1) first[s.charAt(i) - 'a'] = i;
            if(last[s.charAt(s.length() - 1 - i) - 'a'] == -1) last[s.charAt(s.length() - 1 - i) - 'a'] = s.length() - 1 - i;
        }
        for(int i = 0; i < 26;i++){
            answer = Math.max(answer, last[i] - first[i] - 1);
        }
        return answer;
    }
}