class Solution {
    long answer = 0;
    int seats;
    public long minimumFuelCost(int[][] roads, int seats) {
        this.seats = seats;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= roads.length; i++ ) list.add(new ArrayList<>());
        for(int[] road : roads){
            list.get(road[0]).add(road[1]);
            list.get(road[1]).add(road[0]);
        }
        dfs(0,0,list);
        return answer;
        
    }
    public int dfs(int i, int prev, List<List<Integer>> list){
        int people = 1;
        for(int l : list.get(i)){
            if(l == prev) continue;
            people += dfs(l, i, list);
        }
        if(i != 0) answer += (people + seats -1) / seats;
        return people;
    }
}