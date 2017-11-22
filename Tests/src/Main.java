
//twitter
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String args[]){
		String encrypted_message = "Otjfvknou kskgnl, K mbxg iurtsvcnb ksgq hoz atv.";
		String message = decrypt(encrypted_message);
		System.out.println(message);
	}

	private static String decrypt(String encrypted_message) {
		// TODO Auto-generated method stub
		String key = "8251220";
		int nextKey = 0;
		String decrypted = "";
		char start;
		char[] encrypted = encrypted_message.toCharArray();
		for(char c : encrypted){
			if(nextKey == key.length()){nextKey = 0;}
			if(Character.isAlphabetic(c) == false){
				decrypted += c;
				continue;
			}
		if(c <= 'Z'){start = 'A';}
		else{start = 'a';}
		int count = Character.getNumericValue(key.charAt(nextKey++));
		char current = (char)(c - count);
		if(current < start){
			current = (char)(current + 26);
		}
		decrypted += current;
		}
		return decrypted;
	}
}

