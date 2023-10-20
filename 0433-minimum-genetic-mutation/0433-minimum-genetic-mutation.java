class Solution {
    public int minMutation(String start, String end, String[] bank) {
        int answer = 0;
        char[] letters = new char[]{'A','C','G','T'};
        Queue<String> q = new LinkedList<String>();
        Set<String> set = new HashSet<>();
        q.offer(start);
        set.add(start);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                
                String gene = q.remove();
                if(gene.equals(end)) return answer;
                for(char l : letters){
                    
                    for(int j = 0; j < gene.length(); j++){
                        String neighbour = gene.substring(0, j) + l + gene.substring(j + 1);
                        boolean b = Arrays.asList(bank).contains(neighbour);
                        if(!set.contains(neighbour) && Arrays.asList(bank).contains(neighbour)){
                            q.offer(neighbour);
                            set.add(neighbour);
                        }
                    }
                }
            }
            answer++;
        }
        return - 1;
    }
}