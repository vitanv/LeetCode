class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> answer = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        for(int num: arr){
            Set<Integer> next = new HashSet<>();
            next.add(num);
            for(int c: curr){
                next.add(num|c);
            }
            answer.addAll(next);
            curr = next;
        }
        return answer.size();
    }
}