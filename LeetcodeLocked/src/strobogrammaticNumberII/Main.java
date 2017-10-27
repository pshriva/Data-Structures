package strobogrammaticNumberII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		int n = 2;
		//getStrobogrammaticNumber(list, n, n);
		getStrobogrammaticNumber(list,n);
		for(String s : list){
			System.out.println(s);
		}
	}
	//ITERATIVE
		private static void getStrobogrammaticNumber(List<String> list, int n) {
			// TODO Auto-generated method stub
			List<String> temp;
			if(n%2 == 1)temp = Arrays.asList("0","1","8");
			else{temp = Arrays.asList("");}
			for(int i = n%2 + 2; i<=n ; i +=2){
				List<String> current = new ArrayList<String>();
				for(String s : temp){
					if(i != n)
						current.add("0" + s + "0");
					current.add("1" + s + "1");
					current.add("6" + s + "9");
					current.add("8" + s + "8");
					current.add("9" + s + "6");
				}
				temp = current;
			}
			list.addAll(temp);
		}
// RECURSIVE
//	private static void getStrobogrammaticNumber(List<String> list, int n, int length) {
//		// TODO Auto-generated method stub
//		if(n == 0){
//			list.add("");
//			return;
//		}
//		if(n == 1){
//			list.add("1");
//			list.add("0");
//			list.add("8");
//			return;
//		}
//		getStrobogrammaticNumber(list, n-2, length);
//		int size = list.size();
//		int i = 0;
//		while(i<size){
//			String current = list.get(i);
//			if(n != length){
//				list.add("0" + current + "0");
//			}
//			list.add("1" + current + "1");
//			list.add("6" + current + "9");
//			list.add("9" + current + "6");
//			list.add("8" + current + "8");
//			list.remove(0);
//			size--;
//		}
//	}

	
	
}