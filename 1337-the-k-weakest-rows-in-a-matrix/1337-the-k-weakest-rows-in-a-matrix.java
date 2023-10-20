class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] holder = new int[mat.length];
        int[] answer = new int[k];
        for (int i=0;i<mat.length;i++){
            int temp = 0;
            for(int j =0;j<mat[i].length;j++){
                
                if(mat[i][j] == 1) temp ++;
                else if(mat[i][j] == 0){
                    holder[i] = temp;
                    continue;
                }
                if(j == mat[i].length -1) {
                    holder[i] = temp;
                }
            }
        }
        for(int i = 0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = 0;j<mat.length;j++){
                if(holder[j] < min){
                    min = holder[j];
                    index = j;
                }
            }
            answer[i] = index;
            holder[index] = Integer.MAX_VALUE;
        }

        return  answer;
    }
}