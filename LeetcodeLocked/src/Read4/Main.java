package Read4;

public class Main {
	public static void main(String args[]){
		int n = 10;
		char[] buf = new char[n];
		read(buf, n);
	}

	private static void read(char[] buf, int n) {
		// TODO Auto-generated method stub
		int readchars = 0;
		char[] temp = new char[4];
		while(readchars < n){
			int read = read4(temp);
			read = Math.min(read, n-readchars);
			for(int i = 0; i < read; i++){
				buf[readchars++] = temp[i];
			}
			if(read < 4){break;}
		}
	}

	//MOCK API to avoid error on calling read4
	private static int read4(char[] temp) {
		// TODO Auto-generated method stub
		return 0;
	}
}

//public int read(char[] buf, int n) {
//	  boolean eof = false;      // end of file flag
//	  int total = 0;            // total bytes have read
//	  char[] tmp = new char[4]; // temp buffer
//	  
//	  while (!eof && total < n) {
//	    int count = read4(tmp);
//	    
//	    // check if it's the end of the file
//	    eof = count < 4;
//	    
//	    // get the actual count
//	    count = Math.min(count, n - total);
//	    
//	    // copy from temp buffer to buf
//	    for (int i = 0; i < count; i++) 
//	      buf[total++] = tmp[i];
//	  }
//	  
//	  return total;
//	}
