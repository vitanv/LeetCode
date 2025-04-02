class Solution:
    def mostPoints(self, Q: List[List[int]]) -> int:
        dp = [0] * (len(Q) + 1) 
        for i in range(len(Q) - 1, -1, -1):
            points, jump = Q[i][0], Q[i][1]
            dp[i] = max(points + dp[min(jump + i + 1, len(Q))], dp[i + 1])
        return dp[0];
        