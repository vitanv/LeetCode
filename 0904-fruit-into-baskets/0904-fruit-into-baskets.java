class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, baskets = 0, answer = 0, sum = 0;
        while(right < fruits.length){
            if(baskets == 2 && !map.containsKey(fruits[right])){
                map.put(fruits[left], map.getOrDefault(fruits[left], 0) - 1);
                if(map.get(fruits[left]) == 0) {
                    baskets--;
                    map.remove(fruits[left]);
                }
                left++;
                sum--;
            }else{
                if(!map.containsKey(fruits[right])) baskets++;
                map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
                sum++;
                answer = Math.max(answer, sum);
                right++; 
            }
           
        }
        return answer;
    }
}