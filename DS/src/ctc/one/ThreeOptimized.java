package ctc.one;

public class ThreeOptimized {
	public static void main(String args[]){
		String s1 = "ABC";
		String s2 = "ABC";
		boolean isPermutation = new ThreeOptimized().getPermutation(s1,s2);
		if(isPermutation == true){
			System.out.println("String 2 is permutation");
		}else
			System.out.println("String 2 is not a permutation");
	}

	private boolean getPermutation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() != s2.length()){
			return false;
		}
		int[] letters = new int[128];
		for(int i = 0;i<s1.length();i++){
			letters[(int)s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++){
			if(--letters[(int)s2.charAt(i)] < 0)
				return false;
		}
		
		return true;
	}
}
