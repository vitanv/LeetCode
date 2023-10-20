class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] arr = new boolean[s.length() + 1];
        
        arr[0] = true;
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(arr[j] && wordDict.contains(s.substring(j, i))){
                    arr[i] = true;
                    break;
                }
            }
        }
        
        return arr[s.length()];
    }
}