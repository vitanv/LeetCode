class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < strs[0].length();i++){
            for(int j = 1; j < strs.length;j++){
                if(i > strs[j].length() - 1 || strs[0].charAt(i) != strs[j].charAt(i)) return answer.toString();
            }
            answer.append(strs[0].charAt(i));
        }
        return answer.toString();
    }
}