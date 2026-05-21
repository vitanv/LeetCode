class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] answer = new int[A.length];
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            setA.add(A[i]);
            setB.add(B[i]);
            int count = 0;
            for(int number: setA){
                if(setB.contains(number)) count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}