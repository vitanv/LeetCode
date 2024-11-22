class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int[] row : matrix) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < m; j++) {
                temp.append(row[j] == row[0] ? '1' : '0');
            }
            String pattern = temp.toString();
            map.put(pattern, map.getOrDefault(pattern, 0) + 1);
        }

        int answer = 0;
        for (int count : map.values()) {
            answer = Math.max(answer, count);
        }
        return answer;
    }
}