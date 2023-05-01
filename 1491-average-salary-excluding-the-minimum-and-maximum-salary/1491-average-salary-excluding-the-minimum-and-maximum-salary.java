class Solution {
    public double average(int[] salary) {
        double sum = 0, min = salary[0], max = salary[0];
        for(double s : salary){
            sum+= s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        sum = sum - min - max;
        return sum/ (salary.length - 2);
    }
}