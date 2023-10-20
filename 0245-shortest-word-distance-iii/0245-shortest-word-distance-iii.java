class Solution {
    int upper_bound(List<Integer> indices, int value) {
        int left = 0, right = indices.size() - 1;
        int index = indices.size();
        while (left <= right) {
            int mid = (left + right) / 2;

            if (indices.get(mid) > value) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        List<Integer> indices1 = new ArrayList<>();
        List<Integer> indices2 = new ArrayList<>();
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                indices1.add(i);
            }
            if (wordsDict[i].equals(word2)) {
                indices2.add(i);
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int index : indices1) {
            int x = upper_bound(indices2, index);

            if (x != indices2.size()) {
                answer = Math.min(answer, indices2.get(x) - index);
            }

            if (x != 0 && indices2.get(x - 1) != index) {
             answer = Math.min(answer, index - indices2.get(x - 1));
            }
        }

        return answer;
    }
}