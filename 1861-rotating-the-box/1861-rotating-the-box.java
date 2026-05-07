class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        
        for (char[] row : box) {
            int drop = n - 1;
            
            for (int i = n - 1; i >= 0; i--) {
                if (row[i] == '*') {
                    drop = i - 1;
                }
                else if (row[i] == '#') {
                    char temp = row[drop];
                    row[drop] = row[i];
                    row[i] = temp;
                    drop--;
                }
            }
        }
        
        char[][] answer = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer[j][m - 1 - i] = box[i][j];
            }
        }
        
        return answer;
    }
}