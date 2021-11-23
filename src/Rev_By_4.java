
public class Rev_By_4 {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i = num.length-1; i>0; i++) {
			
			
			if(num[i]%4==0) {
				
				System.out.println("" + num[i]);
				
				
			}
		}
	}

}
