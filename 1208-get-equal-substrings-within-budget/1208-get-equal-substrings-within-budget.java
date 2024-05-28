class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int answer = 0, start = 0, cost = 0;
        for(int i = 0; i < s.length(); i++){
            cost += Math.abs(s.charAt(i) - t.charAt(i));
            while(cost > maxCost){
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            answer = Math.max(answer, i - start + 1);
        }
        return answer;
    }
}