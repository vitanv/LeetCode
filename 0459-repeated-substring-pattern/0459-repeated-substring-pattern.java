class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 1; i <= s.length()/ 2; i++){
            if(s.length() % i == 0){
                StringBuilder pattern = new StringBuilder();
                for(int j = 0; j < s.length()/ i; j++){
                    pattern.append(s.substring(0, i));
                }
                if(s.equals(pattern.toString())) return true;
            }
        }
        return false;
    }
}