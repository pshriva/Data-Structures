//Gold

public class Solution {
	public static void main(String args[]){
		String s = "GGrtt";
		s = runLengthEncode(s);
		System.out.println(s);
	}

	private static String runLengthEncode(String input) {
		 StringBuilder sb = new StringBuilder();
		 int count = 0;
	        for(int i = 0; i< input.length(); i++){
	            count = 1;
	            while((i+1)<= input.length()-1 && input.charAt(i) ==input.charAt(i+1)){
	                count++;
	                i++; 
	            }
	            sb.append(count).append(input.charAt(i));
	        }
	        return sb.toString();
	}
}
