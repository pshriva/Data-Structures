package Sample;
public class task1 {

	public static void main(String[] args) {
		
		System.out.println(getSmallInt());
		// TODO Auto-generated method stub
		
	}
	public static int getSmallInt(){
		int[] A = {1,3,6,4,1,2};
		int n = A.length;
		for(int i=0; i<n; i++){
			while( A[i]!= i+1){
				if((A[i] < 0 && A[i] > n+1) || (A[i] == A[A[i]-1])){
					break;
					
				}
				else
				{
					int temp = A[i];
	    			A[i] = A[temp - 1];
	    			A[temp - 1] = temp;
				}
			}	
		}

		for (int i = 0; i < n; i++){
    		if (A[i] != i + 1){
    			//System.out.println(i+1);
    			return i + 1;
    		}
    	}	
		//System.out.println(n+1);
    	return n + 1;
	}

}
