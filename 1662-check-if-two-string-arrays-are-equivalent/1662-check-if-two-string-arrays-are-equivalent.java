class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = build(word1);
        String s2 = build(word2);
        return s1.equals(s2);
        
    }
    public String build(String[] word){
        StringBuilder sb = new StringBuilder();
        for(String s : word){
            for(char c : s.toCharArray()){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}