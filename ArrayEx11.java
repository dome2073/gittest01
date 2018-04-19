import java.util.*;
public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//카운팅 예제
		
		int [] numArr = new int[10];
		int [] counter = new int[10];
		
		for (int i=0;i<numArr.length;i++) { //0~9 까지 
			numArr[i] = (int)(Math.random()*10); //0~9 인덱스에 난수 삽입
			System.out.print(numArr[i]); //삽입된 난수
		}
		System.out.println();
		
		for(int i=0;i< numArr.length;i++) {
			counter[numArr[i]]++; //counter[numArr[0]] //인덱스[6] +1..해당 인덱스에 +1함
		}
		for(int i=0; i<numArr.length;i++) {
			System.out.println(i+"의 개수 : "+ counter[i]);
		}
		System.out.println();
	}

}
//0134668899
