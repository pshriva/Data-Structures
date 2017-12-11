import java.util.HashMap;
import java.util.Map;

public class F5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public String[]  twins(String a[], String b[]){
		String [] out = new String[a.length];
		for(int i = 0; i < a.length; i++){
			if(a[i].length() != b[i].length())out[i] = "No";
			else{out[i] = compareString(a[i], b[i]);}
		}
		
		return out;
	}
	
	public String compareString(String a, String b){
		int n = 128;
		int evenA[] = new int[n];
		int evenB[] = new int[n];
		int oddA[] = new int[n];
		int oddB[] = new int[n];
		for(int i = 0; i < 128; i = i + 2)
			evenA[a.charAt(i)]++;
		for(int i = 0; i < 128; i = i + 2)
			evenB[b.charAt(i)]++;
		for(int j = 1; j < 128; j = j + 2)
			oddA[a.charAt(j)]++;
		for(int j = 1; j < 128; j = j + 2)
			oddB[b.charAt(j)]++;	
		
		for(int i = 0; i < 128; i++){
			if(evenA[i] != evenB[i]){
				return "No";
			}
		}
		for(int i = 0; i < 128; i++){
			if(oddA[i] != oddB[i]){
				return "No";
			}
		}
			
		return "Yes";
		
	}
	
//	public String compareString2(String a, String b){
//		int even = 0, odd = 0;
//		for(int i = 0; i < a.length(); i = i + 2){
//			even = even ^ a.charAt(i) ^ b.charAt(i);
//		}
//		for(int i = 1; i < a.length(); i = i + 2){
//			odd = odd ^ a.charAt(i) ^ b.charAt(i);
//		}
//		if(even == 0 && odd == 0)
//			return "Yes";
//		else
//			return "No";
//	}

}
