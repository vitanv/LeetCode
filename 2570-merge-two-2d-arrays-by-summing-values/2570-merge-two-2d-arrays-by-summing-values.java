class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int[] num: nums1){
            if(map.containsKey(num[0])) {
                map.put(num[0], map.get(num[0]) + num[1]);
            }else{
                map.put(num[0], num[1]);
            }
        }
        for(int[] num: nums2){
            if(map.containsKey(num[0])) {
                map.put(num[0], map.get(num[0]) + num[1]);
            }else{
                map.put(num[0], num[1]);
            }
        }
        int[][] answer = new int[map.size()][2];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            answer[index] = new int[]{entry.getKey(), entry.getValue()};
            index++;
        }
        return answer;
    }
}