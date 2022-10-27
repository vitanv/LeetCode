class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = img1.length, answer = 0;
        for(int i = 0; i < len * len; i++ ){
            if(img1[i / len][i % len] == 1){
                list1.add(i / len *100 + i % len);
            }
        }
        for(int i = 0; i < len * len; i++ ){
            if(img2[i / len][i % len] == 1){
                list2.add(i / len *100 + i % len);
            }
        }
        for(int i : list1) for(int j : list2){
            map.put(i - j, map.getOrDefault(i - j, 0) + 1);
        }
        for(int i : map.values()){
            answer = Math.max(answer, i);
        }
        return answer;
    }
}