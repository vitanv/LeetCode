class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = people.length, total = 0;
        int[] answer = new int[n];
        TreeMap <Integer, Integer> map = new TreeMap<>();
        for(int[] flower: flowers){
            map.put(flower[0], map.getOrDefault(flower[0], 0) + 1);
            map.put(flower[1] + 1, map.getOrDefault(flower[1] + 1, 0) - 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            total += value;
            map.put(key, total);
        }
        for(int i = 0; i < n; i++){
            int time = people[i];
            Integer floorKey = map.floorKey(time);
            answer[i] = (floorKey != null) ? map.get(floorKey) : 0;
        }
        return answer;
    }
}