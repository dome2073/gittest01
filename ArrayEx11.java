import java.util.*;
public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ī���� ����
		
		int [] numArr = new int[10];
		int [] counter = new int[10];
		
		for (int i=0;i<numArr.length;i++) { //0~9 ���� 
			numArr[i] = (int)(Math.random()*10); //0~9 �ε����� ���� ����
			System.out.print(numArr[i]); //���Ե� ����
		}
		System.out.println();
		
		for(int i=0;i< numArr.length;i++) {
			counter[numArr[i]]++; //counter[numArr[0]] //�ε���[6] +1..�ش� �ε����� +1��
		}
		for(int i=0; i<numArr.length;i++) {
			System.out.println(i+"�� ���� : "+ counter[i]);
		}
		System.out.println();
	}

}
//0134668899
