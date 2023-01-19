class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] mod = new int[k];
        int prefix = 0, answer = 0;
        mod[0] = 1;
        
        for(int num: nums){
            prefix = (prefix + num) % k;
            if(prefix < 0) prefix += k;
            answer += mod[prefix];
            mod[prefix]++;
        }
        return answer;
    }
}