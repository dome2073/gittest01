
public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 총합과 평균
		int [] score = {79, 88, 91, 33, 100, 55, 95}; //배열선언, 초기화
		
		int max = score[0]; //score[0] 값으로 초기화
		int min = score[0]; //score[0] 값으로 초기화
		
//		System.out.println(max);
//		System.out.println(min);
	
		for(int i=1; i< score.length;i++) { //i가 배열의 길이만큼 실행
			if(score[i] > max) { //score[i] 값이 max 보다 크면
				max = score[i]; // max를 score[i] 값으로 초기화
			}else if (score[i]< min) {  //score[i]값이 min 보다 작으면
				min = score[i]; // min를 score[i] 값으로 초기화
			}
		}
		System.out.println("최대값 : "+ max);
		System.out.println("최대값 : "+ min);
	}

}
