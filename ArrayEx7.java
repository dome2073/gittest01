
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numArr = new int [10];
		
		for(int i=0; i< numArr.length;i++) { //0부터 numArr의 배열길이만큼 실행 0~9
			numArr[i] = i; //0 ~ 9 값으로 초기화
			System.out.print(numArr[i]); //0123456789
		}
		System.out.println();
		
		for (int i=0; i<100; i++) { //0~99 까지 실행
			int n = (int)(Math.random()*10); //0~9 중 랜덤
			int tmp = numArr[0]; // tmp = num[0]으로 초기화 
			numArr[0] = numArr[n]; // numArr[0] 에 numArr[n]의 값으로 초기화 
			numArr[n] = tmp; //numArr[n]초기화 된 값을 tmp로 
		}
		for(int i=0; i < numArr.length; i++) { //0~9
			System.out.print(numArr[i]); 
		}
	}
}
