package longestSubstringWithAtlmostKElements;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String args[]){
		String str = "abcadcacacaca";
		int k = 3;
		int maxSubstringLength = getMaxSubstring(str,k);
		System.out.println(maxSubstringLength);
	}

	private static int getMaxSubstring(String s, int k) {
		// TODO Auto-generated method stub
		if(s == null || k == 0 || s.length() ==0){
			return 0;
		}
		if(s.length()<k){
			return s.length();
		}
		int left = 0;
		int maxLength = 0;
		Map<Character, Integer> map = new HashMap();
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			System.out.println("Putting " + c);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
			for(Character key: map.keySet()){
				System.out.println(key + " " + map.get(key));
			}
			if(map.size()>k){
				maxLength = Math.max(maxLength, i-left);
				while(map.size()>k){
					char ch = s.charAt(left);
					if(map.get(ch) == 1){
						map.remove(ch);
					}else{
						map.put(ch, map.get(ch)-1);
					}
					left++;
				}
				System.out.println("Size restored ");
			}
		}
		maxLength = Math.max(maxLength, s.length()-left);
		return maxLength;
	}
}
