import java.util.*;
public class FlowEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0, sum=0;
		System.out.print("���ڸ� �Է��ϼ���. (��: 12345) >"); //�����Է�
		
		Scanner scanner = new Scanner(System.in); 
		String tmp = scanner.nextLine(); //�Է��� ���ڸ� tmp�� ����
		num = Integer.parseInt(tmp); // num�� �Է��� ���ڸ� ���������� ����
		
		while(num!=0) { //�Է¹������ڰ� 0�� �ƴѵ��� ����
			sum += num%10; //�Է� ������ %10 �� sum �� �߰�
			System.out.printf("sum=%3d num=%d%n",sum, num); // sum = num/10 �� ������ 
															// num = �Է¹�����
			num /=10; // �Է¹����� /10 
		}
		System.out.println("�� �ڸ��� �� ��:"+sum);
	}
}
