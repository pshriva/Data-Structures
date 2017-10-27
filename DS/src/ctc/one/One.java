package ctc.one;

import java.util.Scanner;

public class One {
	public static void main(String args[]){
		One one = new One();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		boolean isUnique = one.getUniqueCharacters(s);
		if(isUnique == true){
			System.out.println("The string has all unique characters");
		}else{
			System.out.println("The has is not all unique");
		}
	}

	boolean getUniqueCharacters(String s) {
		// TODO Auto-generated method stub
		boolean isUnique = true;
		int k = 0;
		int arr[] = new int[s.length()];
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			for(int j=0;j<arr.length;j++){
				if(arr[j]==ch){
					isUnique = false;
					break;
				}
			}
			if(isUnique == false){
				break;
			}else if(isUnique == true){
				arr[k] = ch;
				k++;
			}
		}
		return isUnique;
	}
}
