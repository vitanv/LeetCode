class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int total = 0, index = 0;
        while(total <= k){
            total += chalk[index];
            index++;
            if(index == chalk.length) index = 0;
        }
        return (index == 0) ? chalk.length - 1 :index- 1;
    }
}