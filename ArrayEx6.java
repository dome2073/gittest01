
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최대값과 최소값
		int sum = 0; 
		float average = 0f;
		
		int[] score = {100, 88, 100, 100 ,90}; //배열 선언 및 초기화
		
		for(int i=0; i<score.length;i++) {  // i가 배열의 길이만큼 실행
			sum += score[i]; //sum에 score[0] ~ [4] 까지의 값을 더함
		}
		average = sum / (float)score.length; // 평균 = 총점 /5 
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}

}
