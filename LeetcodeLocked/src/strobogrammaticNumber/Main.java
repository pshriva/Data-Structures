package strobogrammaticNumber;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]){
		String s = "878";
		boolean b = isStrobogrammatic(s);
		System.out.println(b);
	}

	private static boolean isStrobogrammatic(String s) {
		// TODO Auto-generated method stub
//		Map<Character, Character> map = new HashMap<Character, Character>();
//		map.put('0','0');
//		map.put('1','1');
//		map.put('6','9');
//		map.put('8','8');
//		map.put('9','6');
//		int left = 0, right = s.length()-1;
//		for(; left<=right;left++,right--){
//			if(!map.containsKey(s.charAt(left)))return false;
//			if(map.get(s.charAt(left)) != s.charAt(right))return false;
//		}
//		return true;
		
		// without using map:
		int left = 0, right = s.length()-1;
		for(; left<=right; left++, right--){
			if(!"00 11 696 88".contains(s.charAt(left) + "" + s.charAt(right))){
				return false;
			}
		}
		return true;
	}
}
