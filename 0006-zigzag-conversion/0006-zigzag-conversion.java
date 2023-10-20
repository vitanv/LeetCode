class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1 ) return s;
        int sections = (int) Math.ceil(s.length()/(2 * numRows - 2.0));
        int numCols = sections * (numRows - 1);
        char[][] matrix = new char[numRows][numCols];
        
        for(char[] row : matrix){
            Arrays.fill(row, ' ');
        }
        int currRow = 0, currCol = 0;
        int currString = 0;
        
        while(currString < s.length()){
            while(currRow < numRows && currString < s.length()){
                matrix[currRow][currCol] = s.charAt(currString);
                currRow++;
                currString++;
            }
            currRow -=2;
            currCol++;
            
            while(currRow > 0 && currCol < numCols && currString < s.length()){
                matrix[currRow][currCol] = s.charAt(currString);
                currRow--;
                currCol++;
                currString++;
            }
        }
        StringBuilder answer = new StringBuilder();
        for(char[] row : matrix){
            for(char c: row){
                if(c != ' ') answer.append(c);
            }
        }
        return answer.toString();
    }
}