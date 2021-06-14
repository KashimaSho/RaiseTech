package raiseTech02;
import java.time.LocalDateTime;

public class ThreeYearsLater {

	public static void main(String[] args) {

		LocalDateTime t = LocalDateTime.now();//今の年，月，曜日，日，時，分，秒を取得
		System.out.println(t);
		System.out.println("Year:"+t.getYear());
		System.out.println("Month:"+t.getMonth());
		System.out.println("DayOfWeek:"+t.getDayOfWeek());
		System.out.println("Day:"+t.getDayOfMonth());
		System.out.println("Hour:"+t.getHour());
		System.out.println("Minute:"+t.getMinute());
		System.out.println("Second:"+t.getSecond());


		System.out.print("\n");
		System.out.println("3年後の今日は，"+t.plusYears(3).getDayOfWeek()+"です。");
	}

}
