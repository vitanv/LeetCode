class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private HashMap<Integer, Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map = new HashMap<>();
        for(int num: nums2){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int prev = nums2[index];
        map.put(prev, map.get(prev) -1);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0)+ 1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int num: nums1){
            int rest = tot - num;
            count += map.getOrDefault(rest, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */