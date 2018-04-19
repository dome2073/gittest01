
public class star8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<5+i;j++) { //6,7,8,9,10
				if(j+i>=6) { 
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
//8.
//    *  i==1, j==5 ==* 1+5=6 
//   *** i==2, j==4,5,6 ==* 2,4=6
//  ***** i==3, j=3,4,5,6,7 3+3=6
// ******* i==4, j==2,3,4,5,6,7,8 4+2=6
//********** i==5, j==1,2,3,4,5,6,7,8,9,10 5+1 =6 

//1,1 =x 1,2=x 1,3=x 1,4=x, 1,5=o *, 1,6=o