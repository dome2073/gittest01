import java.util.*;
public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		boolean flag = true;
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ��� . (�������� 0)");
		
		while(flag) { //�ּ� �ѹ����� 
			System.out.print(">>"); 
			
			Scanner scanner = new Scanner(System.in); //�����Է�
			String tmp = scanner.nextLine(); //�Է¹��� ���� tmp�� ����
			num = Integer.parseInt(tmp); //tmp�� ������ ��ȯ�ؼ� num�� ����
			
			if(num!=0) { //num�� 0�� �ƴϸ� sum�� num���� ����
				sum += num;
			}else { // 0������ ����
				flag = false;
			}
		}
		System.out.println("�հ� : "+sum); //���� num�� ���
	}
}
