import java.util.*;
public class FlowEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu =0, num =0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer: //반복문 전체 
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			
			String tmp = scanner.nextLine(); //입력받은 문자열
			menu = Integer.parseInt(tmp); //입력받은 문자열을 정수로 저장
			
			if(menu==0) { // 0입력시 사용종료
				System.out.println("프로그램을 종료합니다");
				break;
			}else if (!(1<=menu && menu<=3)) { //입력받은 값이 1~3사이의 값이 아닐때 처음으로 돌아감
				System.out.println("메뉴를 잘 못 선택하셨습니다. (종료는  0)");
				continue;
			}
			for(;;) { 
				System.out.print("계산할 값을 입력하세요 . (계산 종료 : 0, 전체 종료 : 99)>>");
				tmp = scanner.nextLine();  //계산할 값 입력
				num = Integer.parseInt(tmp); 
				
				if(num==0) //0으로 계산종료
					break;
				
				if(num==99) //99로 전체종료
					break outer;
				
				switch(menu) { 
					case 1: //1번선택
						System.out.println("result = "+ num*num); //제곱
						break;
						
					case 2: //2번선택
						System.out.println("result = "+ Math.sqrt(num)); //루트
						break;
					case 3: //3번선택
						System.out.println("result = "+ Math.log(num)); //로그
						break;
				}	
			}
		}
	}
}
