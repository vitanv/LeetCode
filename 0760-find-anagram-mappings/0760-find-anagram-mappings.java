class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] answer = new int [nums1.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.computeIfAbsent(nums2[i], a -> new ArrayList<>()).add(i);
        }
        for(int i = 0; i < nums1.length; i++) {
            answer[i] = map.get(nums1[i]).remove(map.get(nums1[i]).size()-1);
        }
        return answer;
    }
}