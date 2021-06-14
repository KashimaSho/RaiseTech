package raiseTech02;
import java.util.Scanner;
public class TrueOrFalse {

	public static void main(String[] args) {
		System.out.println("0 または 1 を入力してください．");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		TorF(n);
		scan.close();
	}

	private static void TorF(int i) {
		if (i == 0) {
			System.out.println("偽");
		}else if (i == 1) {
			System.out.println("真");
		}else {
			System.out.println("0 または 1 以外の値が入力されたため判定できません．");
		}

	}
}
