class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] connections = new int[n];
        boolean[][] connected = new boolean[n][n];
        int answer = 0;
        
        for(int[] road: roads){
            connections[road[0]]++;
            connections[road[1]]++;
            connected[road[0]][road[1]] = true;
            connected[road[1]][road[0]] = true;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                answer = Math.max(answer, connections[i] + connections[j] - (connected[i][j] ? 1 : 0));
            }
        }
        return answer;
    }
}