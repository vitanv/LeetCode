class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ate = 0, passed = 0;
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < students.length; i++){
            q.add(students[i]);
            s.push(sandwiches[sandwiches.length - 1 - i]);
        }
        while(!q.isEmpty()){
            if(q.peek() == s.peek()){
                q.poll();
                s.pop();
                ate++;
                passed = 0;
            }else{
                q.add(q.poll());
                passed++;
            }
            if(passed == q.size()) return students.length - ate;
        }
        return 0;
    }
}