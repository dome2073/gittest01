
public class OperatorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' '; 
		
		int i = c1 + 1;
		
		c3 = (char)(c1+1);
		c2++;
		c2++;
		
		System.out.println("i = " +i); //int형으로 바뀜. i = c1+1 연산과정에서 int 형으로 바뀜
		System.out.println("c2 = " +c2); // c2++,c2++ =c
		System.out.println("c3 = " +c3); // (char)(c1+1) = b
	}

}
