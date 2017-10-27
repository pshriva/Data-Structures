package sortTransformedArray;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*Given a sorted array of integers nums and integer values a, b and c. Apply a
function of the form f(x) = ax2 + bx + c to each element x in the array.
The returned array must be in sorted order.
Expected time complexity: O(n)
Example:
nums = [-4, -2, 2, 4], a = 1, b = 3, c = 5,
Result: [3, 9, 15, 33]
nums = [-4, -2, 2, 4], a = -1, b = 3, c = 5
Result: [-23, -5, 1, 7] 
TC is O(n)  and SC is O(n)*/
public class Main {
	public static void main(String args[]){
		int[] arr = {-4, -2, 2, 4};
		int a = -1;
		int b = 3;
		int c = 5;
		transform(arr, a, b, c);
		for(int i : arr){
			System.out.println(i);
		}
	}

	private static void transform(int[] arr, int a, int b, int c) {
		// TODO Auto-generated method stub
		int result = 0;
		Queue<Integer> queue =  new PriorityQueue<Integer>((x, y) -> {return x-y;});
		for(int i = 0; i < arr.length; i++){
			result = a*arr[i]*arr[i] + b*arr[i] + c;
			queue.add(result);
		}
		int k = 0;
		while(!queue.isEmpty()){
			int i = queue.poll();
			arr[k++] = i;
		}
	}
}
