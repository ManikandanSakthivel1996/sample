package Collect1;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car(50000,"maruti","red",65);
		Car c2 = new Car(120000,"bmw","white",55);
		Car c3 = new Car(500000,"audi","blue",76);
		Car c4 = new Car(50000,"","green",66);
		Car c5 = new Car(300000,"mahindra","blue",57);
		Car c6 = new Car(600000,"jaguar","black",45);
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		//for(int i=0;i<cars.size();i++) {
			//System.out.println(cars.get(i));  // car[i]
			//if(cars.get(i).getBrand().equals("audi")) {
				//cars.get(i).setMileage(cars.get(i).getMileage()-2);
			//}
			//else if (cars.get(i).getBrand().equals("bmw")){
				//cars.get(i).setMileage(cars.get(i).getMileage()-3);
			//}
			//}
		//cars.forEach(x->System.out.println(x));
		for(Car x: cars) {
			if(x.getPrice()>250000 && x.getPrice()<500000) {
				x.setPrice(x.getPrice()+x.getPrice()*5/100);
				System.out.println(x.getBrand()+","+x.getPrice());
				}
			else if(x.getPrice()>500000 && x.getPrice()<500000) {
				x.setPrice(x.getPrice()+x.getPrice()*10/100);
				System.out.println(x.getBrand()+","+x.getPrice());
			}
			}
		}
	}
	
