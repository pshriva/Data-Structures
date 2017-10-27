package reverseStringUsingStack;
// reversing the string using 2 pointers, 1 at the end of string and 1 at the start and
//swapping characters, is better approach as TC there is O(n) and SC is O(1), whereas,
// here TC is O(n) but SC is also O(n).
public class Main {
	public static void main(String args[]){
		String s = "Pranjali Shrivastava";
		System.out.println("String is " + s);
		s = reverse(s);
		System.out.println("Reverse of the string is " + s);
	}

	public static String reverse(String str) {
		// TODO Auto-generated method stub
		Stack s = new Stack(str.length());
		str = s.reverse(str);
		return str;
	}
}
