import java.util.*;
public class FlowEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu =0, num =0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer: //�ݺ��� ��ü 
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			
			String tmp = scanner.nextLine(); //�Է¹��� ���ڿ�
			menu = Integer.parseInt(tmp); //�Է¹��� ���ڿ��� ������ ����
			
			if(menu==0) { // 0�Է½� �������
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if (!(1<=menu && menu<=3)) { //�Է¹��� ���� 1~3������ ���� �ƴҶ� ó������ ���ư�
				System.out.println("�޴��� �� �� �����ϼ̽��ϴ�. (�����  0)");
				continue;
			}
			for(;;) { 
				System.out.print("����� ���� �Է��ϼ��� . (��� ���� : 0, ��ü ���� : 99)>>");
				tmp = scanner.nextLine();  //����� �� �Է�
				num = Integer.parseInt(tmp); 
				
				if(num==0) //0���� �������
					break;
				
				if(num==99) //99�� ��ü����
					break outer;
				
				switch(menu) { 
					case 1: //1������
						System.out.println("result = "+ num*num); //����
						break;
						
					case 2: //2������
						System.out.println("result = "+ Math.sqrt(num)); //��Ʈ
						break;
					case 3: //3������
						System.out.println("result = "+ Math.log(num)); //�α�
						break;
				}	
			}
		}
	}
}
