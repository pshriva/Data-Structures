package MeetingRooms;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String args[]){
		Interval[] intervals = new Interval[]{new Interval(0,30), new Interval(5,10), new Interval(15,20)};
		boolean b = canAttendMeetings(intervals);
		System.out.println(b);
	}

	private static boolean canAttendMeetings(Interval[] intervals) {
		Arrays.sort(intervals, new Comparator<Interval>(){
			public int compare(Interval a, Interval b){
				return a.start - b.start;
			}
		});
		
		for(int i = 0; i< intervals.length-1; i++){
			if(intervals[i].end>intervals[i+1].start){return false;}
		}
		return true;
	}
}
