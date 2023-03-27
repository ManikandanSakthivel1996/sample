package Collect1;

import java.util.ArrayList;

public class SampleOdd {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		li.add("mani");
		li.add("john");
		li.add("ram");
		li.add("lakshman");
		li.add("velu");
		for(int i=0;i<li.size();i++) {
			if(i%2!=0) {
				System.out.print(li.get(i).toUpperCase());
			}
		}
	}

}

