class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int answer = 0, n = customers.length, temp = minutes;
        for(int i = 0; i < n; i++){
            if(grumpy[i] == 0 || temp > 0) {
                answer+= customers[i];
                temp--;   
            }
        }
        int curr = answer;
        System.out.print(curr);
        for(int i = minutes; i < n; i++){
            if(grumpy[i] == 1) curr += customers[i];
            if(grumpy[i - minutes] == 1) curr -= customers[i - minutes];
            answer = Math.max(answer,curr);
        }
        return answer;
    }
}