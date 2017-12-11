package SampleTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class liveramp {

	public int getMinWindow(int[] A) {
		int n = A.length;
		int visit_count = 0;
		int start = 0;
		int min_len = Integer.MAX_VALUE;
		int count = 0;
		HashMap<Integer, Integer> val_count = new HashMap<Integer, Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (!visited.contains(A[i])) {
				visited.add(A[i]);
				visit_count++;
			}
		}
		for (int i = 0; i < n; i++) {
			val_count.put(A[i], val_count.getOrDefault(A[i], 0) + 1);
			if (val_count.get(A[i]) == 1) {
				count++;
			}
			if (count == visit_count) {
				while (val_count.get(A[start]) > 1) {
					if (val_count.get(A[start]) > 1)
						val_count.put(A[start], val_count.get(A[start]) - 1);
					start++;
				}
				int window_len = i - start + 1;
				if (min_len > window_len) {
					min_len = window_len;
				}
			}
		}
		return min_len;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 1, 3, 4,7};
		liveramp sol = new liveramp();
		System.out.println(sol.getMinWindow(arr));
	}

}
