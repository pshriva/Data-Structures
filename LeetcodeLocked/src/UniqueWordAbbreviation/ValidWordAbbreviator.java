package UniqueWordAbbreviation;

import java.util.HashMap;
import java.util.Map;

public class ValidWordAbbreviator {
	Map<String, String> map;
	public ValidWordAbbreviator(String[] dictionary){
		map = new HashMap<String, String>();
		for(String s : dictionary){
			if(s.length() == 0){continue;}
			String abb = getAbbreviation(s);
			if(!map.containsKey(abb)){
				map.put(abb, s);
			}else{
				if(!map.get(abb).equals(s)){
					map.put(abb, "");
				}
			}
		}
	}
	private String getAbbreviation(String s) {
		// TODO Auto-generated method stub
		if(s.length() <= 2){return s;}
		String abbr = "" + s.charAt(0) + (s.length()-2) + s.charAt(s.length()-1);
		return abbr;
	}
	public boolean isUnique(String string) {
		// TODO Auto-generated method stub
		return (!map.containsKey(getAbbreviation(string)) || map.get(getAbbreviation(string)).equals(string));
	}
}
