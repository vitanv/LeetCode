class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set = new HashSet<>();
        int answer = 0;
        for(char c : s.toCharArray()){
            set.add(c);
        }
        for(char c: set){
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);
            if(start < end){
                HashSet<Character> charSet = new HashSet<>();
                for(int i = start + 1; i < end; i++){
                    charSet.add(s.charAt(i));
                }
                answer += charSet.size();
            }
        }
        return answer;
    }
}