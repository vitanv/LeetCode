class Solution {
    public int maxWidthRamp(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = i;
        }
        Arrays.sort(arr,(i, j) -> nums[i] != nums[j]? nums[i] - nums[j] : i - j);
        int min = nums.length, answer = 0;
        for(int i: arr){
            answer = Math.max(answer, i - min);
            min = Math.min(min, i);
        }
        return answer;
    }
}