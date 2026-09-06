/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() < 2) return true;
        Interval first = intervals.get(0);
        int i = 1;
        Interval second = intervals.get(i);
        while (i < intervals.size()) {
            if (second.start < first.end && second.end > first.start) return false;
            i++;
            if (i < intervals.size()) {
                first = second;
                second = intervals.get(i);
            }
        }
        return true;
    }
}
