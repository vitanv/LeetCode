class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : nums1){
            if(!set2.contains(num)){
                set2.add(num);
                list1.add(num);
            }
        }
        for(int num : nums2){
            if(!set1.contains(num)){
                set1.add(num);
                list2.add(num);
            }
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);
        return answer;
    }
}