class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.') continue;
                if(!set.contains("R"+i+board[i][j]) && !set.contains("C"+j+board[i][j]) && !set.contains("B"+i/3+j/3+board[i][j])){
                    set.add("R"+i+board[i][j]);
                    set.add("C"+j+board[i][j]);
                    set.add("B"+i/3+j/3+board[i][j]);
                }else {
                    return false;
                };
            }
        }
        return true;
    }
}