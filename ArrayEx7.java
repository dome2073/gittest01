
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numArr = new int [10];
		
		for(int i=0; i< numArr.length;i++) { //0���� numArr�� �迭���̸�ŭ ���� 0~9
			numArr[i] = i; //0 ~ 9 ������ �ʱ�ȭ
			System.out.print(numArr[i]); //0123456789
		}
		System.out.println();
		
		for (int i=0; i<100; i++) { //0~99 ���� ����
			int n = (int)(Math.random()*10); //0~9 �� ����
			int tmp = numArr[0]; // tmp = num[0]���� �ʱ�ȭ 
			numArr[0] = numArr[n]; // numArr[0] �� numArr[n]�� ������ �ʱ�ȭ 
			numArr[n] = tmp; //numArr[n]�ʱ�ȭ �� ���� tmp�� 
		}
		for(int i=0; i < numArr.length; i++) { //0~9
			System.out.print(numArr[i]); 
		}
	}
}
