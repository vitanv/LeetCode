class Solution {
    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray(), chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        for(int i = 0;i<chars.length;i++){
            if(chars[i] != chart[i]) return chart[i];}
        return chart[chart.length-1];
    }
}