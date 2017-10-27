package ctc.one;

public class Seven {
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
		new Seven().getZeroElements(arr);
		System.out.println("After the function call");
		for(int i =0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	private void getZeroElements(int[][] arr) {
		// TODO Auto-generated method stub
		boolean rows[]=new boolean[arr.length];
		boolean columns[]=new boolean[arr[0].length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==0){
					rows[i]=true;
					columns[j]=true;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(rows[i] || columns[j]){
					arr[i][j]=0;
				}
			}
		}
	}
}
