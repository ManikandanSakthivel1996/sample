package Collect1;
import java.util.ArrayList;
public class Arr1 {
	
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
			
			for(int i=0;i<li.size();i++) {
				System.out.println(li.get(i));
			}
			
			for(Integer num : li) {
				System.out.println(num);
			}
			li.forEach(x->System.out.println(x));
		}
	}
