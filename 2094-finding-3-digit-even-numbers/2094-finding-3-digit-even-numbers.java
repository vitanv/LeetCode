class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for(int digit: digits){
            freq[digit]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 100; i < 1000; i+= 2){
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = i / 100;
            freq[a]--;
            freq[b]--;
            freq[c]--;
            if(freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0) list.add(i);
            freq[a]++;
            freq[b]++;
            freq[c]++;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}