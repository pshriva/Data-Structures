package ctc.one;

public class Five {
	public static void main(String args[]){
		String s = "";
		String compressedString = new Five().getCompressedString(s);
		System.out.println(compressedString);
	}
	private String getCompressedString(String s) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(s.charAt(0));
		int count = 1;
		for(int i =1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				count++;
				if(i == s.length() - 1){
					sb.append(count);
				}
			}else{
				sb.append(count).append(s.charAt(i));
				count = 1;
			}
		}
		if(s.length()==sb.toString().length()){
			return s;
		}else
		return sb.toString();
	}
}
