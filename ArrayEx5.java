
public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���հ� ���
		int [] score = {79, 88, 91, 33, 100, 55, 95}; //�迭����, �ʱ�ȭ
		
		int max = score[0]; //score[0] ������ �ʱ�ȭ
		int min = score[0]; //score[0] ������ �ʱ�ȭ
		
//		System.out.println(max);
//		System.out.println(min);
	
		for(int i=1; i< score.length;i++) { //i�� �迭�� ���̸�ŭ ����
			if(score[i] > max) { //score[i] ���� max ���� ũ��
				max = score[i]; // max�� score[i] ������ �ʱ�ȭ
			}else if (score[i]< min) {  //score[i]���� min ���� ������
				min = score[i]; // min�� score[i] ������ �ʱ�ȭ
			}
		}
		System.out.println("�ִ밪 : "+ max);
		System.out.println("�ִ밪 : "+ min);
	}

}
