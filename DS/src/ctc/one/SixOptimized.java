package ctc.one;

public class SixOptimized {
	public static void main(String args[]){
		int arr[][]= {{4,2,8,1,12,34},{3,9,7,3,1,5},{0,5,4,6,11,15},{14,54,67,23,19,81},{1,2,3,4,5,6},{7,8,9,0,1,2}};
		int n = 6;
		System.out.println("Before calling the function");
		for(int i =0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		new SixOptimized().rotateByNinetyDegree(arr,n);
		System.out.println("After rotation");
		for(int i =0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	private void rotateByNinetyDegree(int[][] arr, int n) {
		// TODO Auto-generated method stub
		int k =0;
		for(int i=0;i<n/2;i++){
			int last = n-1-i;
			k = 0;
			for(int j = i;j<last;j++){
				int top = arr[i][j];
				arr[i][j]=arr[last-k][i];
				arr[last-k][i]=arr[last][last-k];
				arr[last][last-k]=arr[j][last];
				arr[j][last]=top;
				k++;
			}
		}
		
	}
}
