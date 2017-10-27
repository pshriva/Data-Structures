
public class MergeSort {
	public static void main(String args[]){
		MergeSort ms = new MergeSort();
		int arr[] = {12,32,1,45,3,65};
		System.out.println("Array before sorting");
		for(int i:arr){
			System.out.println(i);
		}
		ms.merge_sort(arr,0,5);
		System.out.println("Array after sorting");
		for(int i:arr){
			System.out.println(i);
		}
	}

	void merge_sort(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		if(p<r){
			int q = (p+r)/2;
			merge_sort(arr,p,q);
			merge_sort(arr,q+1,r);
			merge(arr,p,q,r);
		}
	}

	void merge(int[] arr, int p, int q, int r) {
		// TODO Auto-generated method stub
		int L[] = new int[q-p+1];
		int R[] = new int[r-q];
		for(int i=0; i<(q-p+1);i++){
			L[i]=arr[p+i];
		}
		for(int i = 0;i<r-q;i++){
			R[i] = arr[q+1+i];
		}
		int i=0,j=0,k=p;
		while(i<L.length && j<R.length){
			if(L[i]<R[j]){
				arr[k]=L[i];
				i++;
			}
			else{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<L.length){
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<R.length){
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	
}
