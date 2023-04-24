class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int s:stones) li.add(s);
        while(li.size() > 1){
            Collections.sort(li,Collections.reverseOrder());
            if(li.get(0)>li.get(1)) li.add(li.get(0)-li.get(1));
            li.remove(0);
            li.remove(0);
        }
        if(li.size()>0)return li.get(0);
        return 0;
        
    }
}