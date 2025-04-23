class Solution {
    public int countLargestGroup(int n) {
        int answer = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++){
            int sum = 0,num = i;
            while(num >= 10){
                sum+= num % 10;
                num /= 10;
            }
            sum += num;
            map.put(sum, map.getOrDefault(sum, 0)+1);
            max = Math.max(max, map.get(sum));
        }
        for(int key: map.keySet()){
            if(map.get(key) == max) answer++;
        }
        return answer;
    }
}