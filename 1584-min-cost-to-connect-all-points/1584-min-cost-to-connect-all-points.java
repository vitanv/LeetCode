class Solution {
    public int minCostConnectPoints(int[][] points) {
        int answer = 0, n = points.length;
        int [] distance = new int[n];
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i = 1; i < n; i++){
            distance[i] = measure(points, 0, i);
        }
        while(set.size() != n){
            int next = -1;
            for(int i = 0; i < n; i++){
                if(set.contains(i)) continue;
                if(next == -1 || distance[next] > distance[i])  next = i;
            }
            set.add(next);
            answer+= distance[next];
            for(int i = 0; i < n; i++){
                if(!set.contains(i)) distance[i] = Math.min(distance[i], measure(points, i, next));
            }
        }
        return answer;
    }
    public int measure(int[][] points, int a, int b){
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
}