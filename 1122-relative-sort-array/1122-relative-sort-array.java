class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr2){
            map.put(num, 0);
        }
        List<Integer> extra = new ArrayList<>();
        for(int num: arr1){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                extra.add(num);
            }
        }
        Collections.sort(extra);
        List<Integer> answer = new ArrayList<>();
        for(int num: arr2){
            while(map.get(num) > 0){
                answer.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        answer.addAll(extra);
        return answer.stream().mapToInt(Integer::intValue).toArray();
        
    }
}