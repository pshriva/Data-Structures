package Test2;
//Sample input
//E:jackAndJill@twitter.com
//P:(333)456-7890
//E:jackAndJill@twitte
//P:+1(333) 456-7890

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String input;
		List<String> data = new ArrayList<String>();
		while ((input = stdin.readLine()) != null && input.length()!= 0) {
			data.add(input);
		}
		String masked = getMaskedData(data);
		System.out.println(masked);
	}

	private static String getMaskedData(List<String> data) {
		// TODO Auto-generated method stub
		StringBuilder masked = new StringBuilder();
		for(String s : data){
			if(s.startsWith("E:")){
				masked.append(maskEmail(s)).append("\n");
			}else if(s.startsWith("P:")){
				masked.append(maskPhoneNumber(s)).append("\n");
			}
		}
		return masked.toString();
	}

	private static String maskPhoneNumber(String s) {
		// TODO Auto-generated method stub
		StringBuilder masked = new StringBuilder();
		s = s.replace("P:", "").replace("(", "").replace(")", "").replace(" ","").replace("-","");
		String lastDigits = s.substring(s.length()-4);
		int count = 0;
		int starCount = 0;
		for(int i = s.length()-1; i >= 0; i--){
			if(starCount == 4){starCount = 0;}
			if(count<4){
				masked.append(s.charAt(i));
				count++;
				continue;
			}
			else if(s.charAt(i) == '+'){
				masked.append("+");
			}
			else if(starCount == 0){
				starCount++;
				masked.append("-").append("*");
			}else{
				masked.append("*");
			}
			starCount++;
		}
		masked.append(":P");
		return masked.reverse().toString();
	}

	private static String maskEmail(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("E:");
		s = s.replace("E:", "");
		sb.append(s.charAt(0));
		int i = 0;
		while(i++<5){
			sb.append("*");
		}
		sb.append(s.charAt(s.indexOf("@")-1)).append(s.substring(s.indexOf("@")));
		return sb.toString();
	}
}
