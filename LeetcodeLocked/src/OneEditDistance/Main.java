package OneEditDistance;

public class Main {
	public static void main(String args[]){
		String s = "abc";
		String t = "zabc";
		boolean b = isOneEditDistance(s,t);
		System.out.println(b);
	}

	private static boolean isOneEditDistance(String s, String t) {
		// TODO Auto-generated method stub
		if(s == null || t == null){return false;}
		int sLen = s.length();
		int tLen = t.length();
		if(Math.abs(sLen - tLen)>1){return false;}
		int i = 0;
		int j = 0;
		int count = 0;
		while(i<sLen && j<tLen){
			if(s.charAt(i) == s.charAt(j)){
				i++;
				j++;
			}else{
				if(count++>1){return false;}
				if(sLen<tLen){tLen++;}
				else if(tLen < sLen){sLen++;}
				else{
					sLen++;
					tLen++;
				}
			}
		}
		if(i<sLen || j<tLen){count++;}
		return count == 1;
	}
}
