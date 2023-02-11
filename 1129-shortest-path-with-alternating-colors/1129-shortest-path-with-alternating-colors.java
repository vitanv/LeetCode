class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        HashSet<Integer>[][] matrix = new HashSet[2][n];
        int[][] arr = new int[2][n];
        for(int i = 0; i < n; i++){
            matrix[0][i] = new HashSet<>();
            matrix[1][i] = new HashSet<>();
        }
        for(int[] edge : redEdges){
            matrix[0][edge[0]].add(edge[1]);
        }
        for(int[] edge : blueEdges){
            matrix[1][edge[0]].add(edge[1]);
        }
        for(int i = 1; i < n; i++){
            arr[0][i] = 2 * n;
            arr[1][i] = 2 * n;
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        q.offer(new int[]{0,1});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int vert = curr[0];
            int colour = curr[1];
            for(int next: matrix[1 - colour][vert]){
                if(arr[1 - colour][next] == 2 * n){
                    arr[1 - colour][next] = 1 + arr[colour][vert];
                    q.offer(new int[]{next, 1 - colour});
                }
            }
        }
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int temp = Math.min(arr[0][i], arr[1][i]);
            if(temp == 2 * n){
                answer[i] = -1;
            }else{
                answer[i] = temp;
            }
        }
        return answer;
    }
}