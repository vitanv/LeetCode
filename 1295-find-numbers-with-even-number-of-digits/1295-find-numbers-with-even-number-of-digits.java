class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;
        for(int n : nums){
            int par = 0;
            while(n > 0){
                n /= 10;
                par++;
            }
            if(par % 2 == 0) answer++;
        }
        return answer;
    }
}