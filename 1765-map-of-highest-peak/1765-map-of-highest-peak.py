class Solution(object):
    def highestPeak(self, isWater):
        m, n = len(isWater), len(isWater[0])
        height = [[-1] * n for _ in range(m)]
        bfs = deque([])
        for r in range(m):
            for c in range(n):
                if isWater[r][c] == 1:
                    bfs.append((r, c))
                    height[r][c] = 0

        DIR = [0, 1, 0, -1, 0]
        while bfs:
            r, c = bfs.popleft()
            for i in range(4):
                nr, nc = r + DIR[i], c + DIR[i + 1]
                if nr < 0 or nr == m or nc < 0 or nc == n or height[nr][nc] != -1: continue
                height[nr][nc] = height[r][c] + 1
                bfs.append((nr, nc))
        return height