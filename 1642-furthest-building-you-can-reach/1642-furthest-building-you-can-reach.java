class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> climb = new PriorityQueue<>(Collections.reverseOrder());
        int max = 0, answer = 0;
        for(int i = 1;i < heights.length;i++){
            if(heights[i] > heights[i-1]){
                int temp = heights[i] - heights[i-1];
                climb.offer(temp);
                bricks -= temp;
                if(bricks < 0 && ladders > 0){
                    bricks += climb.poll();
                    ladders--;
                }else if(bricks < 0 && ladders <= 0){
                    return i-1;
                }
            } 
        }
       return heights.length - 1;
    }
}