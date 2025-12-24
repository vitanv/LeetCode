class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int answer = 0, count = 0;
        for(int a: apple){
            count+= a;
        }
        Arrays.sort(capacity);
        int index = capacity.length - 1;
        while(count > 0){
            count -= capacity[index];
            index--;
            answer++;
        }
        return answer;
    }
}