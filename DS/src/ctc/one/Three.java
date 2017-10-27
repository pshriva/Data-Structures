package ctc.one;

public class Three {
	public static void main(String args[]){
		String s1 = "ABC";
		String s2 = "BOX";
		boolean isPermutation = new Three().getPermutation(s1,s2);
		if(isPermutation == true){
			System.out.println("String 2 is permutation");
		}else
			System.out.println("String 2 is not a permutation");
	}

	boolean getPermutation(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean isPermutation = true;
		if(s1.length() != s2.length()){
			System.out.println("Inside if");
			isPermutation = false;
			return isPermutation;
		}else{
			System.out.println("Inside else");
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					if(s1.charAt(i) == s2.charAt(j)){
						s2=s2.replace(s2.charAt(j), '0');
						break;
					}
				}
			}
			for(int i=0;i<s2.length();i++){
				if(s2.charAt(i) != '0'){
					isPermutation = false;
					break;
				}
			}
		}
		return isPermutation;
	}
}
