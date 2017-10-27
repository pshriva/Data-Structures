package ctc.one;

public class Four {
	public static void main(String args[]){
		String s1 ="ABC DEF GHI";
		new Four().replaceSpaces(s1,s1.length());
	}

	void replaceSpaces(String s1, int length) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0;i<length;i++){
			if(s1.charAt(i)==' '){
				count++;
			}
		}
		int newLength = length + 2*count;
		char[] s = new char[newLength]; //increasing the space complexity to O[n], not in place algorithm
		//Also this algo creates a copy (s) of s1 and not alteing the same string
		int k = 0;
		for(int i = 0; i<length;i++){
			if(s1.charAt(i) == ' '){
				s[k++]='%';
				s[k++]='2';
				s[k++]='0';
			}else{
				s[k]=s1.charAt(i);
				k++;
			}
		}
		for(int i =0;i<newLength;i++){
			System.out.println(s[i]);
		}
	}
}
