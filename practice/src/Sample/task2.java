package Sample;
// you can also use imports, for example:

import java.util.*;

import java.lang.*;

// you can write to stdout for debugging purposes, e.g.

// System.out.println("this is a debug message");

//playing cards, say when A wins
class task2 {
	
	public static void main(String[] args){
		System.out.println(solution("A586QK","JJ653K"));
	}
    public static  int solution(String A, String B) {
        int AlecWinCount=0;
        for(int i=0;i< A.length();i++){
                if(checkAlecWins(A.charAt(i),B.charAt(i)))
                	AlecWinCount++;
         }
        return AlecWinCount;
    }

    private static boolean checkAlecWins(char a,char b){
       String s ="AKQJT";
         if(Character.isDigit(a) && Character.isDigit(b)){
                return a>b;
          }
        else if((!Character.isDigit(a) && Character.isDigit(b)))
                return true;
        else if(Character.isDigit(a) && !Character.isDigit(b)){
                return false;
                }
        else if(s.indexOf(a)<s.indexOf(b)){
               return true;
             }
        return false;
//      String s ="AKQJT";
//      if(Character.isDigit(a) && Character.isDigit(b)){
//             return a>b;
//       }//If Alec card is not digit and Bob's card is digit
//     else if(!Character.isDigit(a) && Character.isDigit(b))
//             return true;
//     else if(Character.isDigit(a) && !Character.isDigit(b)){
//             return false;
//             }
//    else if(s.indexOf(a)<s.indexOf(b)){
//
//            return true;
//
//          }
//     return false;
    }
}





