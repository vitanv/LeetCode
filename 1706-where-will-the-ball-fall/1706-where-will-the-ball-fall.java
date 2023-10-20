class Solution {
    public int[] findBall(int[][] grid) {
        int len = grid[0].length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            int column = i, row = 0;
            boolean reached = true;
            while(row < grid.length){
                if(grid[row][column] == 1){
                    if(column+1 < len && grid[row][column+1] == 1){
                        column++;
                        row++;
                    }else{
                        reached = false;
                        break;
                    }
                }else{
                    if(column-1 >= 0 && grid[row][column-1] == -1){
                        column--;
                        row++;
                    }else{
                        reached = false;
                        break;
                    }
                }
            }
            if(reached){
                answer[i] = column;
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}