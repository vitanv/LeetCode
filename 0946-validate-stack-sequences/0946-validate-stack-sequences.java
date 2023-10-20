class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack();
        int len = pushed.length, i = 0;
        for (int j : pushed){
            st.push(j);
            while(!st.isEmpty() && i < len && st.peek() == popped[i]){
                st.pop();
                i++;
            }
        }
        return i == len;
    }
}