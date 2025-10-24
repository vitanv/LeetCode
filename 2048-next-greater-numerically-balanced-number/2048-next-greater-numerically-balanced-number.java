class Solution {
    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; ; i++){ 
            if (solve(i)) return i;
            }
    }
    public boolean solve(int x){
        String s = String.valueOf(x);
        int[] arr = new int[10];
        for (char ch : s.toCharArray()) arr[ch - '0']++;
        for (char ch : s.toCharArray()){
            int c = ch - '0';
            if (c == 0 || arr[c] != c) return false;
        }
        return true;
    }
}