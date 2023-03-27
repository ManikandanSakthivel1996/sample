package Collect1;

public class Car {
	private int price;
	private String brand;
	private String color;
	private int mileage;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public  int getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setMileage(int mileage) {
		this.mileage=mileage;
	}
	public int getMileage() {
		return mileage;
	}
	
	public Car(int price,String brand,String color,int mileage) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.mileage=mileage;
	}
	public String toString() {
		return "BRAND:"+brand+",PRICE:"+price+",COLOR:"+color+",MILEAGE:"+mileage;
	}
}

