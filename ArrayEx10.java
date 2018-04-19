
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정렬하기
		int[] numArr = new int[10];  
		
		for(int i=0;i<numArr.length;i++) { //10회 반복
			System.out.print(numArr[i] = (int)(Math.random() *10)); //해당인덱스에 난수 초기화
		}
		System.out.println();
		
		for(int i=0;i < numArr.length-1;i++) { 
			boolean changed = false;
			
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j] > numArr[j+1]) { //다음 인덱스가 더 클 경우
					int temp = numArr[j]; //원래 있던 값을 temp에 초기화하고 
					numArr[j] = numArr[j+1]; //다음 인덱스 값을 원래 있던 값에 초기화 
					numArr[j+1] = temp; // 원래있던값을 다음 인덱스로 옮김.
					changed = true; //changed 를 true로 바꿔줌
				}
			}
			if (!changed) break; // 자리바꿈이 일어나지 않으면 break
			
			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]); //결과출력
			System.out.println();
		}
	}

}
