
public class star9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) { //6,7,8,9,10
				if(j+i>=6) { 
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
//9.    i j
//***** 1,1o 1,2o 1,3o 1,4o 1,5o
// ***  2,1x 2,2o 2,3o 2,4  2,5
//  *   3,1x 3,2x 3,3o 
// ***  4,1x 4,2o 4,3o 4,4o 
//*****
// i<j Âï¾î