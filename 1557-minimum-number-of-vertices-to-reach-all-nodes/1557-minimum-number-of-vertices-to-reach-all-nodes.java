class Solution {
      public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            boolean[] check = new boolean[n];
            for (List<Integer> edge : edges) {
                check[edge.get(1)] = true;
            }

            List<Integer> list = new ArrayList();
            for (int i = 0; i < n; i++) {
                if (!check[i]) {
                    list.add(i);
              }
            }

            return list;
      }
}