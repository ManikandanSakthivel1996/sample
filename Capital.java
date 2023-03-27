package Collect1;
import java.util.ArrayList;

public class Capital {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		char name1 = a[0].charAt(0);
		char name2 = a[1].charAt(1);
		char name3 = a[2].charAt(2);
		char name4 = a[3].charAt(3);
		ArrayList <Character>names = new ArrayList<Character>();
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
	}

}
