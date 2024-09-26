class MyCalendar {
    TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        map.put(start, map.getOrDefault(start,0) + 1);
        map.put(end, map.getOrDefault(end,0) - 1);
        int curr = 0;
        for(int i : map.values()){
            curr += i;
            if(curr >= 2){
                map.put(start, map.get(start) - 1);
                map.put(end, map.get(end) + 1);
                if(map.get(start) == 0) map.remove(start);
                return false;
            }
        }
        return true;
    }
}


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */