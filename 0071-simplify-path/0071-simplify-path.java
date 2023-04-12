class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(String a : arr){
            if(a.equals(".") || a.isEmpty()){
                continue;
            }else if(a.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }else{
                stack.add(a);
            }
        }
        StringBuilder answer = new StringBuilder();
        for(String s : stack){
            answer.append("/");
            answer.append(s);
        }
        if(answer.length() > 0 ) return answer.toString();
        return "/";
    }
}