class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] diff = new int[capacity.length];
        for(int i = 0; i < capacity.length; i++){
            diff[i] = capacity[i] - rocks[i];
        }
        int answer = 0;
        Arrays.sort(diff);
        for(int d : diff){
            additionalRocks -= d;
            if(additionalRocks < 0) break;
            answer++;
            
        }
        return answer;
    }
}