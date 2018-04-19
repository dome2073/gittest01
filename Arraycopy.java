
public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Num = {1,2,3,4,5};
		int [] newNum = new int[10];
//		for(int i=0;i<Num.length;i++) {
//			newNum[i] = Num[i];
//		}
//		newNum = Num;
		System.arraycopy(Num,0, newNum,0,Num.length);
		System.out.println(newNum);
	}

}
