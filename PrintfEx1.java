
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =1;
		short s =2;
		char c= 'A';
		
		int finger =10;
		long big = 100_000_000_000L; 
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; 
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("b=%d%n", b);  // b를 10진수 정수로출력
		System.out.printf("s=%d%n", s); // s를 10진수 정수로출력
		System.out.printf("c=%c, %d %n", c,(int)c); //c를 문자로출력, 정수로출력
		System.out.printf("finger=[%5d]%n", finger); //finger을  [] 5자리를 중 
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("octNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("octNum=%s, %d%n", Integer.toBinaryString(binNum),binNum);
		
		
	}

}
