
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ϱ�
		int[] numArr = new int[10];  
		
		for(int i=0;i<numArr.length;i++) { //10ȸ �ݺ�
			System.out.print(numArr[i] = (int)(Math.random() *10)); //�ش��ε����� ���� �ʱ�ȭ
		}
		System.out.println();
		
		for(int i=0;i < numArr.length-1;i++) { 
			boolean changed = false;
			
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j] > numArr[j+1]) { //���� �ε����� �� Ŭ ���
					int temp = numArr[j]; //���� �ִ� ���� temp�� �ʱ�ȭ�ϰ� 
					numArr[j] = numArr[j+1]; //���� �ε��� ���� ���� �ִ� ���� �ʱ�ȭ 
					numArr[j+1] = temp; // �����ִ����� ���� �ε����� �ű�.
					changed = true; //changed �� true�� �ٲ���
				}
			}
			if (!changed) break; // �ڸ��ٲ��� �Ͼ�� ������ break
			
			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]); //������
			System.out.println();
		}
	}

}
