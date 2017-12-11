package Medium;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "aaaa";
		String B = "a";
		
		int result = repeatedStringMatch(A, B);
		System.out.println(result);
	}
	public static int repeatedStringMatch(String A, String B) {
        if(A == null || B == null){return -1;}
        int count = 1;
        System.out.println(A + " " + B);
        boolean contains = false;
        while(A.length()<= 2*(B.length())){
            if(A.contains(B)){
                contains = true;
                break;}
            A = A+ A;
            count++;
        }
        
        return contains == true ? count :-1;
    }

}
