class UndergroundSystem {
    HashMap<Integer, Pair<String, Integer>> checkIn = new HashMap<>();
    HashMap<String, Pair<Double, Integer>> route = new HashMap<>();
    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id, new Pair<>(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> temp = checkIn.get(id);
        checkIn.remove(id);
        String routeName = temp.getKey() + "_" + stationName;
        int total = t - temp.getValue();
        Pair<Double, Integer> fullRoute = route.getOrDefault(routeName, new Pair<>(0.0,0));
        route.put(routeName, new Pair<>(fullRoute.getKey() + total, fullRoute.getValue()+1));
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String routeName = startStation + "_" + endStation;
        Pair<Double, Integer> trip = route.get(routeName);
        double answer = trip.getKey()/trip.getValue();
        return answer; 
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */