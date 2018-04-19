
public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j<=i) { //
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) { //1
			for (int j = 5; j >=1; j--) { //1 2 3 4 5 
				if(j>i) {
					System.out.print(" ");	
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	
		for (int i = 5; i >= 1; i--) { //1
			for (int j = 1; j <=9; j++) { //1 2 3 4 5 6 7 8
				if(j>=i) { //i+4
					System.out.print("*");		
				}else {
					System.out.print("");
				}
			}
			System.out.println();
		}
		
		System.out.println();
			
		
	for (int i = 1; i <=5; i++) { //1
		for (int j = 1; j <=5; j++) { //1 2 3 4 5 6 7 8
			if(i<=j) { 
				System.out.print("*");	
			}else {
				System.out.print("");
			}
		}
		System.out.println();
		}
	System.out.println();
	
	
	
	for (int i = 0, j=0; i < 9; i++) {
         for (int k = 0; k < (9 - j); k++) {
        	 if(k<j) {
        		 System.out.print(" ");
        	 }else {
        		 System.out.print("*");
        	 }
         }
         if(i < 4){
                 j++;
         }else{
                 j--;
         }
         System.out.println();
	 }
	
	 System.out.println();
	 
	for (int i = 1; i <=5; i++) { //1
		for (int j = 1; j<=8; j++) { //1 2 3 4 5 6 7 8 //8// 
			System.out.print("*");
		}
		System.out.println();
		}
	
	
	}
}

//8 1/3/5/7/9

