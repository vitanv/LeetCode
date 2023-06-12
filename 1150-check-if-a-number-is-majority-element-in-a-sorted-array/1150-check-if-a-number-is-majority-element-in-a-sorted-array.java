class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        if(map.get(target) == null) return false;
        return map.get(target) > nums.length / 2;
    }
}