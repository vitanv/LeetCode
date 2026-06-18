class Solution {
  public double angleClock(int hour, int minutes) {
    int oneMinAngle = 6, oneHourAngle = 30;
    double minutesAngle = oneMinAngle * minutes, hoursAngle = (hour % 12 + minutes / 60.0) * oneHourAngle;

    double diff = Math.abs(hoursAngle - minutesAngle);
    
    return Math.min(diff, 360 - diff);
  }
}