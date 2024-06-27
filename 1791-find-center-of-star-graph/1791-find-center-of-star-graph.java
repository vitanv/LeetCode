class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        for(int e: edges[1]){
            if(e == a) return a;
        }
        return b;
    }
}