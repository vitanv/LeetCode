class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int answer = 0, greed = 0, size = 0;
        while(greed < g.length && size < s.length){
            if(s[size] >= g[greed]){ 
                greed++;
                answer++;
                size++;
            }else{
                size++;
            }
        }
        return answer;
    }
}