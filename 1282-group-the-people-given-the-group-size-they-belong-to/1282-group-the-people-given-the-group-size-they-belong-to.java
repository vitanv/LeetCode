class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i], new ArrayList<>());
            }
            List<Integer> list = map.get(groupSizes[i]);
            list.add(i);
            if(list.size() == groupSizes[i]){
                answer.add(list);
                map.remove(groupSizes[i]);
            }
        }
        return answer;
    }
}