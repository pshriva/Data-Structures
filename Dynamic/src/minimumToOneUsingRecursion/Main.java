package minimumToOneUsingRecursion;
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
		int steps = getStepsForReductionToOne(10);
		System.out.println("Minimum number of steps are " + steps);
	}

	public static int getStepsForReductionToOne(int i) {
		// TODO Auto-generated method stub
		if(i == 1){
			return 0;
		}
		int x =i, y = i, z = i;
		System.out.println("FOR I = " + i);
		if(i%2 == 0){
			System.out.println("checking for m(" + i/2 + ")");
			x = getStepsForReductionToOne(i/2);
			if(x == 0){   // this if part is an optimization to reduce further calculation using /3 or -1, as we have found a 0 here, means minimum steps have been found
				return 1; // result would be same even if we do not apply this optimization, just that more time will be taken
			}
		}
		if(i%3 == 0){
			System.out.println("checking for m(" + i/3 + ")");
			y = getStepsForReductionToOne(i/3);
			if(y == 0){
				return 1;
			}
		}
		z = getStepsForReductionToOne(i-1);
		System.out.println("checking for m(" + (i-1) + ")");
		if(z == 0){
			return 1;
		}
		return 1+ (x<y?(x<z?x:z):(y<z?y:z));
	}
}
