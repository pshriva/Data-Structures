package ctc.one;

public class OneOptimized {
	public static void main(String args[]){
		String s ="IAMTHEBOSS";
		boolean isUnique = new OneOptimized().checkIfUnique(s);
		if(isUnique==true){
			System.out.println("The string has all unique characters");
		}
		else{
			System.out.println("String has duplicate characters");
		}
	}

	boolean checkIfUnique(String s) {
		// TODO Auto-generated method stub
		boolean set[] = new boolean[128];
		for(int i = 0;i<s.length();i++){
			int c = s.charAt(i);
			if(set[c]==true){
				return false;
			}else{
				set[c] = true;
			}
		}
		return true;
	}
}
