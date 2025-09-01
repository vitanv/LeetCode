class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double answer = 0.0;
        PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparing(a -> -a[0]));
        for(int[] c: classes){

            pq.offer(new double[]{ratio(c[0], c[1]), c[0], c[1]});
            
        }
        while(extraStudents --> 0){
            double[] top  = pq.poll();
            pq.offer(new double[]{ratio(top[1] + 1, top[2] + 1), top[1] + 1, top[2] + 1});
        }
        while(!pq.isEmpty()){
            double[] top = pq.poll();
            answer += top[1]/ top[2];
        }
        return answer/ classes.length;
    }
    public double ratio(double a, double b){
        return (a + 1) / (b + 1) - a / b;
    }
}