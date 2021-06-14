package raiseTech02;
import java.util.ArrayList;
import java.util.Scanner;

public class UseListAndMap {

	public static void main(String[] args) {

		int i = 1;
		ArrayList<String> mt = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

/*		System.out.println("\'end\'と入力して終了する。");
		while(true) {
			System.out.println("I want to go to ...");
			String str = scan.nextLine();
			System.out.println(str);
			if(str == "end") {
				break;
			}
			mt.add(str);
		}
*/
		System.out.println("行きたい場所を5ヶ所入力してください。");
		while(i <= 5) {
			System.out.println("I want to go to ...");
			String str = scan.nextLine();
			mt.add(str);
			i++;
		}
		scan.close();
		System.out.println("私が行ってみたいところは"+mt.size()+"ヶ所あります。");
		System.out.println(mt);


	}
}
