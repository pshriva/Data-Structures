//you can also use imports, for example:
package Sample;
import java.util.*;



//you can write to stdout for debugging purposes, e.g.

//System.out.println("this is a debug message");

//smallest subarray containing all the array elements

class task3 {

 public static void main(String[] args){
	 int[] A = {7,3,3,1,3,4,1,7};
	// int[] A = {1,2};
	 System.out.println(solution(A));
 }
 public static int solution(int[] A) {
     if(A.length <= 1){
         return A.length;
     }
     //Create a set of distinct locations
     HashSet<Integer> distinctLocations= new HashSet<Integer>();
     for(Integer location: A){
         distinctLocations.add(location);
     }
     int first=0;
     int last= 1;
     while(last < A.length && !distinctLocations.isEmpty()){
         distinctLocations.remove(A[last]);
             if(A[last] == A[first]){
                 first++;
                 last++;
             }else{last++;}
     }
     return last- first;
     }
}