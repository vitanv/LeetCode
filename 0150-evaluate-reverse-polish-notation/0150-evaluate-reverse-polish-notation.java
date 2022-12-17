class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int a = 0, b = 0, op = 0;
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                a = stack.pop();
                b = stack.pop();
                stack.add(a + b);
            }else if(tokens[i].equals("*")){
                a = stack.pop();
                b = stack.pop();
                stack.add(a * b);
            }else if(tokens[i].equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b /a);
            }else if(tokens[i].equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b - a);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            
        }
        return stack.pop();
    }
}