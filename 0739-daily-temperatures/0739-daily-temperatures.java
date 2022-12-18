class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i < len;i++){
            int currTemp = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()]  < currTemp){
                int prev = stack.pop();
                answer[prev] = i - prev;
            }
            stack.push(i);
        }
        return answer;
    }
}