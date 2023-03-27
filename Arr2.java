package Collect1;

import java.util.ArrayList;

public class Arr2 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(20);
		li.add(35);
		li.add(68);
		li.add(75);
		li.add(38);
		li.add(80);
		li.add(97);
		li.add(19);
		int min = li.get(0);
		int max = li.get(0);
			for(int i=1;i<li.size();i++) {
				if(li.get(i)<=min) {
					min=li.get(i);
				}
				else if (li.get(i)>max) {
					max=li.get(i);
				}
			}
					System.out.println(min);
					System.out.println(max);			
		}
}
