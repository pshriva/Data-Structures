package ctc.one;

public class FourOptimized {
	public static void main(String args[]){
		char[] str = {'I',' ','a','m',' ','t','h','e',' ','b','o','s','s',' ',' ',' ',' ',' ',' ',' '};
		System.out.println("Hie there");
		str = new FourOptimized().getSpacesRemoved(str,13);
		for(int i=0; str[i] != '\0';i++){
			System.out.print(str[i]);
		}
	}

	private char[] getSpacesRemoved(char[] str, int length) {
		// TODO Auto-generated method stub
		int space = 0;
		for(int i=0;i<length;i++){
			if(str[i]==' '){
				space++;
			}
		}
		int newLength = length + 2*space;
		str[newLength]='\0';
		for(int i = length-1;i>=0;i--){
			if(str[i]!= ' '){
				str[newLength - 1]= str[i];
				newLength--;
			}else{
				str[newLength-1]='0';
				str[newLength-2]='2';
				str[newLength-3]='%';
				newLength =newLength-3;
			}
		}
		return str;
	}
}
