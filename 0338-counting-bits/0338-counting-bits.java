class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i = 0; i <= n; i++){
            ans[i] = hammingWeight(i);
        }
        return ans;
    }
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count += (n & 1);
            n = n>>>1;
        }
        return count;
    }
}