class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num: nums2){
            if(set.contains(num)){
                set.remove(num);
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}