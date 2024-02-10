class Solution {
    int count = 1;
    public int countSubstrings(String s) {
        if(s.length() == 0) return 0;
        for(int i = 0; i < s.length()-1;i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return count;
    }
    private void palindrome(String s, int i, int j){
        while(i>= 0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            count++;
            i--;
            j++;
        }
    }
}