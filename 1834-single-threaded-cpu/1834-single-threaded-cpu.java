class Solution {
    public int[] getOrder(int[][] tasks) {
        int[][] sorted = new int[tasks.length][3];
        for(int i = 0; i < tasks.length; i++){
            sorted[i][0] = tasks[i][0];
            sorted[i][1] = tasks[i][1];
            sorted[i][2] = i;
        }
        PriorityQueue<int[]> next = new PriorityQueue<int[]>((x, y) -> (x[1] != y[1] ? (x[1] - y[1]) : (x[2] - y[2])));
        int tasksProcessingOrder[] = new int[tasks.length];
        Arrays.sort(sorted, (x, y) -> Integer.compare(x[0], y[0]));
        
        long time = 0;
        int index = 0, answer = 0;
        
        while(index < tasks.length || !next.isEmpty()){
            if(next.isEmpty() && time < sorted[index][0]) time = sorted[index][0];
            
            while(index < tasks.length && time >= sorted[index][0]){
                next.add(sorted[index]);
                index++;
            }
            int process = next.peek()[1];
            int temp = next.peek()[2];
            next.remove();
            time += process;
            tasksProcessingOrder[answer] = temp;
            answer++;
        }
        return tasksProcessingOrder;
    }
}