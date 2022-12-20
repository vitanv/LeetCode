class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while(!stack.isEmpty()){
            int temp = stack.pop();
            set.add(temp);
            for(int key : rooms.get(temp)){
                if(!set.contains(key)) stack.add(key);
            }
        }
        return set.size() == rooms.size();
    }
}