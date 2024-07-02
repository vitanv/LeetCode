class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        for(int num: nums2){
            if(map.get(num) != null && map.get(num) > 0){
                answer.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}