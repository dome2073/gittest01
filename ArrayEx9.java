import java.util.*;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ������ �迭 ä���
		
		int [] code = {-4,-1,-3,6,11};
		int [] arr = new int[10]; 
		
		for(int i=0;i<arr.length;i++) { //10���ݺ�
			int tmp = (int)(Math.random()*code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr)); //Array.toString ==�迭��ȯ
	}

}
