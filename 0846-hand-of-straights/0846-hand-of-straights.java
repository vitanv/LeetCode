class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int card: hand){
            map.put(card,map.getOrDefault(card, 0)+1);
        }
        Arrays.sort(hand);
        for(int i = 0; i < hand.length; i++){
            if(map.get(hand[i]) == 0) continue;
            for(int j = 0; j < groupSize; j++){
                int curr = hand[i] + j;
                if(map.getOrDefault(curr, 0) == 0) return false;
                map.put(curr, map.get(curr) - 1);
            }
        }
        return true;
    }
}