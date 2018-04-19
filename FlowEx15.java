import java.util.*;
public class FlowEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0, sum=0;
		System.out.print("숫자를 입력하세요. (예: 12345) >"); //숫자입력
		
		Scanner scanner = new Scanner(System.in); 
		String tmp = scanner.nextLine(); //입력한 숫자를 tmp에 저장
		num = Integer.parseInt(tmp); // num에 입력한 숫자를 정수형으로 저장
		
		while(num!=0) { //입력받은숫자가 0이 아닌동안 실행
			sum += num%10; //입력 받은값 %10 을 sum 에 추가
			System.out.printf("sum=%3d num=%d%n",sum, num); // sum = num/10 의 나머지 
															// num = 입력받은값
			num /=10; // 입력받은값 /10 
		}
		System.out.println("각 자리수 의 합:"+sum);
	}
}
