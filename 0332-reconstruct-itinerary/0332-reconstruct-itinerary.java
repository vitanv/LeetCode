class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> answer = new ArrayList<>();
        HashMap<String, PriorityQueue<String>> map = new HashMap<>();
        for(List<String> ticket : tickets){
            map.computeIfAbsent(ticket.get(0),pq -> new PriorityQueue());
            map.get(ticket.get(0)).add(ticket.get(1));
        }
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while(!stack.empty()){
            while(map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()){
                stack.push(map.get(stack.peek()).poll());
            }
            answer.add(0, stack.pop());
        }
        return answer;
    }
}