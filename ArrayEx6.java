
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ִ밪�� �ּҰ�
		int sum = 0; 
		float average = 0f;
		
		int[] score = {100, 88, 100, 100 ,90}; //�迭 ���� �� �ʱ�ȭ
		
		for(int i=0; i<score.length;i++) {  // i�� �迭�� ���̸�ŭ ����
			sum += score[i]; //sum�� score[0] ~ [4] ������ ���� ����
		}
		average = sum / (float)score.length; // ��� = ���� /5 
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}

}
