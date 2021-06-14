package raiseTech02;

public class Sum10 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);


	}
//for (int sum=1; sum<=10; sum++) {
//	sum += sum;
//}
//System.out.println(sum);
//sumはfor文の中でのみ使える変数であるため上の文はエラーが発生する．

}
