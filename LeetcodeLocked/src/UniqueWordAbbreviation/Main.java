package UniqueWordAbbreviation;
// see question titled as Unique Word Abbreviation from geekgorgeeks or leetcode
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<String, String> map;
	public static void main(String args[]){
		String[] s = {"deer", "door", "cake", "card"};
		ValidWordAbbreviator vb = new ValidWordAbbreviator(s);
		System.out.println(vb.isUnique("deers"));
	}
	
}
