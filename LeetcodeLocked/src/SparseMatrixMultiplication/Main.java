package SparseMatrixMultiplication;

public class Main {
	public static void main(String args[]){
		int[][] A = new int[][]{{1,2},{3,4}};
		int[][] B = new int[][]{{5,6},{7,8}};
		int[][] C = multiply(A,B);
		for(int i = 0; i< C.length; i++){
			for(int j = 0; j< C[0].length; j++){
				System.out.println(C[i][j]);
			}
		}
	}

	//Optimized solutions, kinda parallel processing, I can see for each element of A, if its zero, I dont need to do any corresponding multiplication for A
	private static int[][] multiply(int[][] A, int[][] B) {
		int[][] C = new int[A.length][B[0].length];
		for(int i = 0; i< A.length; i++){
			for(int j = 0; j<A[0].length; j++){
				if(A[i][j] != 0){
					for(int k = 0; k < C[0].length; k++){
						if(B[j][k] != 0){C[i][k] += A[i][j]*B[j][k];}
					}
				}
			}
		}
		return C;
	}

//	private static int[][] multiply(int[][] a, int[][] b) {
//		// TODO Auto-generated method stub
//		int[][] c = new int[a.length][b[0].length];
//		for(int i = 0; i< c.length; i++){
//			for(int j = 0; j< c[0].length; j++){
//				int sum = 0;
//				for(int k = 0; k <a[0].length; k++){
//					System.out.println("Adding " + a[i][k] + " " + b[k][j]);
//					sum += a[i][k]*b[k][j];
//				}
//				c[i][j] = sum;
//			}
//		}
//		return c;
//	}
	
	
}
