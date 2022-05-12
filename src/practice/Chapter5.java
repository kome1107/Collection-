package practice;

import java.util.Set;
import java.util.TreeSet;

public class Chapter5 {

	public static void main(String[] args) {
		// プログラムを作成
		Task t = new Task();
		Set<String> test = new TreeSet<String>();
		test.add(t.s1);
		test.add(t.s2);
		test.add(t.s3);
		test.add(t.s4);
		test.add(t.s5);

		for (String g : test) {
			System.out.println(g);
		}
	}
}
