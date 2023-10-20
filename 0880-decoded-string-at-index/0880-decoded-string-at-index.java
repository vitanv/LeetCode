class Solution {
    public String decodeAtIndex(String s, int k) {
        int n = s.length();
        long size = 0;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                size *= c - '0';
            }else{
                size++;
            }
        }
        for(int i = n - 1; i >= 0; i--){
            char c = s.charAt(i);
            k %= size;
            if(k == 0 && Character.isLetter(c)) return Character.toString(c);
            if(Character.isDigit(c)){
                size /= c - '0';
            }else{
                size--;
            }
        }
        return "";
    }
}