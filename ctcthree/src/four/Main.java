package four;

public class Main {
	public static void main(String args[]) throws Exception{
		Tower[] tower = new Tower[3];
		int capacity = 5;
		int numberOfElements = 5;
		for(int i = 0; i<3; i++){
			tower[i] = new Tower(i,capacity);
		}
		for(int i=numberOfElements-1; i>=0 ;i--){
		//	System.out.println("pushing element " + i);
			tower[0].push(i);
		}
	tower[0].moveDisks(numberOfElements, tower[0], tower[1], tower[2]);
	for(int i = 0; i<capacity ; i++){
		System.out.println(tower[2].pop());
	}
	}
}
