package wallsAndGates;

public class Main {
	public static void main(String args[]){
		int[][] wallsAndGates = {{Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
				                 {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
								 {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
				                 {0, -1,Integer.MAX_VALUE, Integer.MAX_VALUE}};
		for(int i = 0; i<wallsAndGates.length; i++){
			for(int j = 0; j<wallsAndGates[0].length;j++){
				System.out.println(wallsAndGates[i][j]);
			}
		}
		wallsAndGates(wallsAndGates);
		System.out.println("After finding all gates ");
		for(int i = 0; i<wallsAndGates.length; i++){
			for(int j = 0; j<wallsAndGates[0].length;j++){
				System.out.println(wallsAndGates[i][j]);
			}
		}
	}

	private static void wallsAndGates(int[][] rooms) {
		 for (int i = 0; i < rooms.length; i++)
		        for (int j = 0; j < rooms[0].length; j++)
		            if (rooms[i][j] == 0) createGates(rooms, i, j, 0);
	}

	private static void createGates(int[][] rooms, int i, int j, int distance) {
		// TODO Auto-generated method stub
		if (i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] < distance) return;
		rooms[i][j] = distance;
		createGates(rooms, i, j-1, distance+1);
		createGates(rooms, i, j+1, distance+1);
		createGates(rooms, i-1, j, distance+1);
		createGates(rooms, i+1, j, distance+1);
	}
}
