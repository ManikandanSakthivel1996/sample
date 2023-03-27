package Collect1;

import java.util.ArrayList;

public class Arr {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(35);
		list.add(68);
		list.add(75);
		list.set(0,36);
		list.add(1,75);
		list.remove(2);
		System.out.println(list.get(3));
		System.out.println(list.size());
	}

}
