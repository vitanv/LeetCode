class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target) return 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        HashSet<Integer> seen = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < routes.length; i++){
            for(int r : routes[i]){
                ArrayList<Integer> route = map.getOrDefault(r, new ArrayList<>());
                route.add(i);
                map.put(r, route);
            }
        }
        for(int route : map.get(source)){
            q.add(route);
            seen.add(route);
        }
        int count = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int route = q.poll();
                for(int stop : routes[route]){
                    if(stop == target) return count;
                    for(int next : map.get(stop)){
                        if(!seen.contains(next)){
                            seen.add(next);
                        q.add(next);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }
}