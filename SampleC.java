package Collect1;

import java.util.ArrayList;

public class SampleC {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		li.add("mani");
		li.add("john");
		li.add("ram");
		li.add("lakshman");
		li.add("velu");
		String count = "";
		for(int i=0;i<li.size();i++){
			if(i%2==0) {
				count+=li.get(i);
			}
			
		}
		System.out.println(count);
	}

}
