class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];
        if(n == 1) return new String[]{"Gold Medal"};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < score.length; i++){
            map.put(score[i], i);
        }
        Arrays.sort(score);
        for(int i = 0; i < n; i++){
            if(i == 0){
                answer[map.get(score[n - i - 1])] = "Gold Medal";
            }else if(i == 1){
                answer[map.get(score[n - i - 1])] = "Silver Medal";
            }else if(i == 2){
                answer[map.get(score[n - i - 1])] = "Bronze Medal";
            }else{
                answer[map.get(score[n - i - 1])] = Integer.toString(i + 1);
            }
        }
        return answer;
    }
}