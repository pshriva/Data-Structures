package strobogrammaticNumberIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]){
		String lower = "50";
		String higher = "100";
		int count = getNumbersCount(lower, higher);
		System.out.println(count);
	}

	private static int getNumbersCount(String lower, String higher) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<String>();
		List<String> list;
		int count = 0;
		list = Arrays.asList("");
		getNumbers(list, lower.length(), higher.length(), result);
		list = Arrays.asList("0", "1", "8");
		getNumbers(list, lower.length(), higher.length(), result);
		for(String s : result){
			if((s.length() == lower.length() && Integer.parseInt(s)<Integer.parseInt(lower))
				|| (s.length() == higher.length() && Integer.parseInt(s) > Integer.parseInt(higher))){
				continue;
			}
			count++;
		}
		return count;
	}

	private static void getNumbers(List<String> list, int lower, int higher, List<String> result) {
		// TODO Auto-generated method stub
		if(lower == 1){
			result.addAll(list);
		}
		for(int i = higher%2+2; i<=higher; i += 2){
			List<String> l = new ArrayList<String>();
			for(String s : list){
				if(i != higher){l.add("0" + s + "0");}
				l.add("1" + s + "1");
				l.add("6" + s + "9");
				l.add("8" + s + "8");
				l.add("9" + s + "6");
			}
			list = l;
			if(i-1 >= lower){
				result.addAll(l);
			}
		}
	}
}
