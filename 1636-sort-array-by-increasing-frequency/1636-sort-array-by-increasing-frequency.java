class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] arr = new Integer[nums.length];
        for(int i = 0;i < nums.length; i++){
            arr[i] = nums[i];
        }
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(arr, (a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return Integer.compare(b,a);
            }
            return Integer.compare(map.get(a), map.get(b));
        });
        for(int i = 0;i < nums.length; i++){
            nums[i] = arr[i];
        }
        return nums;
    }
}