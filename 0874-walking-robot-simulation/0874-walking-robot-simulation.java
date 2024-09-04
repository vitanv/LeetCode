class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0, d = 0, answer = 0;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        Set<String> set = new HashSet<>();
        for(int[] obs: obstacles){
            set.add(obs[0]+","+ obs[1]);
        }
        for(int cmd: commands){
            if(cmd == -1){
                d = (d + 1) % 4;
            }else if(cmd == -2){
                d = (d + 3) % 4;
            }else{
                for(int i = 0; i < cmd; i++){
                    int nextX = x + dir[d][0];
                    int nextY = y + dir[d][1];
                    if(set.contains(nextX+","+nextY)) break;
                    x = nextX;
                    y = nextY;
                    answer = Math.max(answer, x*x + y*y);
                }
            }
        }
        return answer;
    }
}