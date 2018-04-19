
public class CastingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.1234567f;
		double d =  9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f\n",f); //floatÇü 
		System.out.printf("d = %20.18f\n",d); //doubleÇü
		System.out.printf("d2 = %20.18f\n",d2); // float -> double
		
		
	}

}
