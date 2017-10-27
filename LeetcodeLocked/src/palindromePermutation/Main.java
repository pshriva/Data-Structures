package palindromePermutation;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]){
		String s = "aabaaccb";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 0;
		for(int i = 0; i<s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), (map.get(s.charAt(i)) + 1)%2);
			}else{
				map.put(s.charAt(i), 1);
			}
		}
		for(char c : map.keySet()){
			if(map.get(c) == 1)count++;
		}
		if((s.length()%2 == 0 && count ==0) || (s.length()%2==1 && count == 1)){return true;}
		return false;
	}
}
