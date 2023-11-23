class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> answer = new ArrayList<>();
        for(int i = 0; i < l.length; i++){
            int[] arr = new int[r[i] - l[i] +  1];
            int idx = 0;
            for(int left = l[i]; left <= r[i]; left++){
                arr[idx] = nums[left];
                idx++;
            }
            answer.add(canMakeArithmeticProgression(arr));
        }
        return answer;
    }
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] - arr[i-1] != diff) return false;
        }
        return true;
    }
}