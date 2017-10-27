package flipGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]){
		String s = "+++++++";
		List<String> list = getFlippedStrings(s);
		for(String str : list){
			System.out.println(str);
		}
	}

	private static List<String> getFlippedStrings(String s) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length()-1; i++){
			String current = "";
			if(s.charAt(i) == '+' && s.charAt(i+1) == s.charAt(i)){
				current = s.substring(0, i) + "--" + s.substring(i+2);
				list.add(current);
			}
		}
		return list;
	}
}
