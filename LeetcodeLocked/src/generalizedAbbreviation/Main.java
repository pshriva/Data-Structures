package generalizedAbbreviation;

import java.util.LinkedList;
import java.util.List;

public class Main{
	public static void main(String args[]){
		String test = "test";
		List<String> list = getAbbreviations(test,0);
		for(String s : list){
			System.out.println(s);
		}
	}

	private static List<String> getAbbreviations(String s, int len) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		recurse(s, len, list);
		return list;
	}

	private static void recurse(String s, int len, List<String> list) {
		// TODO Auto-generated method stub
		if(s.length() == len){
			list.add(s);
			return;
		}
		recurse(s, len+1, list);
		String altered = s.substring(0, len) + "1" + s.substring(len +1);
		if(len>0 && Character.isDigit(s.charAt(len-1))){
			int num = Integer.parseInt(s.substring(len-1, len));
			num = num + 1;
			altered = s.substring(0, len-1) + num + s.substring(len+1);
			recurse(altered, len, list);
		}else{
			recurse(altered, len+1, list);
		}
		
		
 	}
}
