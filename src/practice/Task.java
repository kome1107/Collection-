package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
	// プログラムを作成

	LocalDate date1 = LocalDate.of(2021, 10, 21);
	LocalDate date2 = LocalDate.of(2021, 9, 15);
	LocalDate date3 = LocalDate.of(2021, 12, 4);
	LocalDate date4 = LocalDate.of(2021, 8, 10);
	LocalDate date5 = LocalDate.of(2021, 11, 9);

	DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
	String s1 = f.format(date1) + " 牛乳を買う。";
	String s2 = f.format(date2) + " ○○社面談。";
	String s3 = f.format(date3) + " 手帳を買う。";
	String s4 = f.format(date4) + " 散髪に行く。";
	String s5 = f.format(date5) + " スクールの課題を解く。";

}
