
public class star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=5;i++) {
			for(int j =1;j<=5;j++) {
				if(i+j==6 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
//4.
//*   * 1,5
// * * 2,4
//  * 3
// *  * 2,4
//*    * 1,5