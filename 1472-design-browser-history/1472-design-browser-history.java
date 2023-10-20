class BrowserHistory {
    private Stack<String> history, future;
    private String curr;
    public BrowserHistory(String homepage) {
        history = new Stack<String>();
        future = new Stack<String>();
        curr = homepage;
    }
    
    public void visit(String url) {
        history.push(curr);
        curr = url;
        future = new Stack<String>();
    }
    
    public String back(int steps) {
        while(steps > 0 && !history.isEmpty()){
            future.push(curr);
            curr = history.pop();
            steps--;
        }
        return curr;
    }
    
    public String forward(int steps) {
        while(steps > 0 && !future.isEmpty()){
            history.push(curr);
            curr = future.pop();
            steps--;
        }
        return curr;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */