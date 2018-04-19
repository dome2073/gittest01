import java.util.*;
public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요 . (끝내려면 0)");
		
		while(flag) { //최소 한번동작 
			System.out.print(">>"); 
			
			Scanner scanner = new Scanner(System.in); //슛자입력
			String tmp = scanner.nextLine(); //입력받은 문자 tmp에 저장
			num = Integer.parseInt(tmp); //tmp를 정수로 변환해서 num에 저장
			
			if(num!=0) { //num이 0이 아니면 sum에 num값을 더함
				sum += num;
			}else { // 0누르면 종료
				flag = false;
			}
		}
		System.out.println("합계 : "+sum); //더한 num값 출력
	}
}
