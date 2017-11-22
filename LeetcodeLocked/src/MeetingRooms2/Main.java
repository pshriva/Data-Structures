package MeetingRooms2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import MeetingRooms.Interval;

public class Main {

	public static void main(String[] args) {
		Inter[] interval = new Inter[]{new Inter(2,3), new Inter(3,6), new Inter(3,4), new Inter(4,5), new Inter(7,9)};
		int rooms = minMeetingRooms(interval);
		System.out.println(rooms);
	}

	private static int minMeetingRooms(Inter[] interval) {
		Arrays.sort(interval, new Comparator<Inter>(){
			public int compare(Inter a, Inter b){return a.start - b.start;}
		});
		int rooms = 1;
		Queue<Integer> queue = new  PriorityQueue<Integer>();
		queue.offer(interval[0].end);
		for(int i = 1; i < interval.length; i++){
			if(interval[i].start < queue.peek()){rooms++;}
			else{queue.poll();}
			queue.add(interval[i].end);
		}
		return rooms;
	}

}
