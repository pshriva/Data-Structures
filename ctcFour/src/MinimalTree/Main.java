package MinimalTree;

public class Main {
	public static void main(String args[]){
		MinimalHeightTree mbst = new MinimalHeightTree();
		int arr[] = {1,2,3,4,5,6};
		mbst.createMinimumHeightTree(arr);
		mbst.print();
	}
}
