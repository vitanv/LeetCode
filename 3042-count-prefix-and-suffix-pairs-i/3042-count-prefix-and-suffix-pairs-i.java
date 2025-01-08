class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int answer = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(isPrefixAndSuffix(words[i], words[j])) answer++;
            }
        }
        return answer;
    }
    public boolean isPrefixAndSuffix(String str1, String str2){
        if(str1.length() > str2.length()) return false;
        String pre = str2.substring(0, str1.length());
        String suf = str2.substring(str2.length() - str1.length());
        if(pre.equals(str1) && suf.equals(str1)) return true;
        return false;
    }
}