class Solution {
    public int countNicePairs(int[] nums) {
        int answer = 0, n = nums.length, mod = 1000000007;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i] - reverse(nums[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            answer = (answer + map.getOrDefault(num, 0)) % mod;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return answer;
    }
    public int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}