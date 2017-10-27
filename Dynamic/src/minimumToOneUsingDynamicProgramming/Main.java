package minimumToOneUsingDynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/*Given a positive integer - num, Following is a list of possible operations which can be performed on it:
1. num / 2, If number is divisible by 2
2. num / 3, If number is divisible by 3
3. num - 1
With these 3 available operations, find out the minimum number of steps required to reduce the number to 1.

For example:
1. For num = 1, no. of steps needed - 0
2. For num = 2, no. of steps needed - 1 (num/2)
3. For num = 6, no. of steps needed - 2 (num/3 followed by num/2)
4. For num = 9, no. of steps needed - 2 (num/3 followed by num/3)
 */
public class Main {
	public static void main(String args[]){
		int steps = getNumberOfSteps(10);
		System.out.println("Number of steps are : " + steps);
	}

	private static int getNumberOfSteps(int i) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 0);
		return getNumberOfSteps(i,map);
	}

	private static int getNumberOfSteps(int i, Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		if(map.containsKey(i)){
			return map.get(i);
		}
		int x = i,y=i,z=i;
		if(i%2 == 0){
			System.out.println("checking for m(" + i/2 + ")");
			x = getNumberOfSteps(i/2,map);
			if(map.containsKey(i/2) == false){
				map.put(i/2, x);
			}
			if(x == 0){// this if part is an optimization to reduce further calculation using /3 or -1, as we have found a 0 here, means minimum steps have been found
				// result would be same even if we do not apply this optimization, just that more time will be taken
				return 1;
			}
		}
		if(i%3 == 0){
			System.out.println("checking for m(" + i/3 + ")");
			y = getNumberOfSteps(i/3,map);
			if(map.containsKey(i/3) == false){
				map.put(i/3, y);
			}
			if(y == 0){
				return 1;
			}
		}
		z = getNumberOfSteps(i-1,map);
		System.out.println("checking for m(" + (i-1) + ")");
		if(map.containsKey(i-1) == false){
			map.put(i-1, z);
		}
		if(z == 0){
			 return 1;
		}
		return 1+ (x<y?(x<z?x:z):(y<z?y:z));
	}
}
