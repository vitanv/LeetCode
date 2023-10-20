class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int answer = 0, len = growTime.length, curr = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            list.add(i);
        }
        Collections.sort(list, Comparator.comparingInt(i -> -growTime[i]));
        for(int i = 0; i < len; i++){
            int index = list.get(i);
            int time = curr + plantTime[index] + growTime[index];
            answer = Math.max(answer, time);
            curr += plantTime[index];
        }
        return answer;
    }
}