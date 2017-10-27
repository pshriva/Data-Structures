package ctc.one;

public class Six {
	public static void main(String args[]){
		int arr[][]= {{4,2,8,1},{3,9,7,5},{0,6,11,15},{14,23,19,81}};
		for(int i =0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("Calling function");
		new Six().rotateByNinetyDegree(arr,4);
		
	}

	private void rotateByNinetyDegree(int[][] arr, int n) {
		// TODO Auto-generated method stub
		int brr[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j = 0; j<n;j++){
				brr[i][j]=arr[n-1-j][i];
			}
		}
		for(int i =0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(brr[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
