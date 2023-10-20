class SmallestInfiniteSet {
    HashSet<Integer> set;
    PriorityQueue<Integer> pq;
    Integer curr;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        pq = new PriorityQueue<>();
        curr = 1;
    }
    
    public int popSmallest() {
        int answer;
        if(!pq.isEmpty()){
            answer = pq.poll();
            set.remove(answer);
        }else{
            answer = curr;
            curr++;
        }
        return answer;
    }
    
    public void addBack(int num) {
        if(curr <= num || set.contains(num)) return;
        set.add(num);
        pq.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */