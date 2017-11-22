package FrequencyCount;

//return most frequent word
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String args[]){
		String[] str = new String[]{"hi", "hello", "hello"};
		List<String> result = getFrequentWord(str);
		for(String s : result){
			System.out.println(s);
		}
	}

	private static List<String> getFrequentWord(String[] str) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> result = new ArrayList<String>();
		int max = 0;
		for(String s : str){
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}else{
				map.put(s, 1);
			}
			max = Math.max(max, map.get(s));
		}
		for(String s : map.keySet()){
			if(map.get(s) == max){
				result.add(s);
			}
		}
		return result;
	}
}
