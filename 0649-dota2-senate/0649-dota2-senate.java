class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rq = new LinkedList<>();
        Queue<Integer> dq = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                rq.add(i);
            } else {
                dq.add(i);
            }
        }

        while (!rq.isEmpty() && !dq.isEmpty()) {
            int rTurn = rq.poll();
            int dTurn = dq.poll();
            if (dTurn < rTurn) {
                dq.add(dTurn + senate.length());
            } else {
                rq.add(rTurn + senate.length());
            }
        }

        return rq.isEmpty() ? "Dire" : "Radiant";
    }
}