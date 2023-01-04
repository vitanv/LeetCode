class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int task : tasks){
            map.put(task, map.getOrDefault(task, 0) + 1);
        }
        int answer = 0;
        for(int value : map.values()){
            if(value == 1) return - 1;
            if(value % 3 == 0){
                answer += value/3;
            }else{
                answer += value/ 3 + 1;
            }
                
            
        }
        return answer;
    }
}