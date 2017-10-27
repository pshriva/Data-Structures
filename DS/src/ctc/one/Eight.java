package ctc.one;

public class Eight {
	public static void main(String args[]){
		String s1 ="Watermelon";
		String s2 ="melonWater";
		boolean isSubstring = new Eight().getSubstring(s1,s2);
		if(isSubstring){
			System.out.println("S2 is rotation");
		}else
			System.out.println("S2 is not rotation");
	}

	boolean getSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() == s2.length()){
			String s1s1 = s1 + s1;
			if(s1s1.contains(s2)){
				return true;
			}
		}
		return false;
	}
}
