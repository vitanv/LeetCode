class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> set = new HashSet<>();
        set.add(x+";"+y);
        for(char c: path.toCharArray()){
            switch(c){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            if(set.contains(x+";"+y)) {
                return true;
            }
            set.add(x+";"+y);
        }
        return false;
    }
}