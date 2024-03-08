class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0, answer = 0;
        int[] arr = new int[101];
        for(int num: nums){
            arr[num]++;
            max = Math.max(max, arr[num]);
        }
        for(int num: arr){
            if(num == max) answer+= max;
            
        }
        return answer;
    }
}