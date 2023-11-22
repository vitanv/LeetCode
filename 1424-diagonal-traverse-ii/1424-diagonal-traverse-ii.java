class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int size = 0;
        for(int i = nums.size() - 1; i >= 0; i--){
            for(int j = 0; j < nums.get(i).size(); j++){
                if(!map.containsKey(i + j)) map.put(i + j, new ArrayList<Integer>());
                map.get(i + j).add(nums.get(i).get(j));
                size++;
            }
        }
        int[] answer = new int[size];
        int idx = 0, curr = 0;
        while(map.containsKey(curr)){
            for(int num: map.get(curr)){
                answer[idx] = num;
                idx++;
            }
            curr++;
        }
        return answer;
    }
}