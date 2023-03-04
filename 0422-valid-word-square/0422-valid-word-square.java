class Solution {
    public boolean validWordSquare(List<String> words) {
        int rows = words.size();
        int columns = 0;
        for(String word : words){
            columns = Math.max(columns, word.length());
        }
        if(columns != words.get(0).length() || rows != columns) return false;
        int r = 0, c = 0;
        int[][] matrix = new int[rows][columns];
        for(String word : words){
            for(Character w : word.toCharArray()){
                matrix[r][c] = w;
                c++;
            }
            r++;
            c=0;
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                if(matrix[j][i] != matrix[i][j]) return false;
            }
        }
        return true;
    }
}