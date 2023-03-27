package Collect1;
import java.util.*;
import java.util.HashMap;
public class UseBook {
	public static void main(String[] args) 	{
		String[] a = args[0].split(",");
		String[] b = args[1].split(",");
		String[] c = args[2].split(",");
		Book book1 = new Book(a[0],Integer.parseInt(a[1]),Boolean.parseBoolean(a[2]));
		Book book2 = new Book(b[0],Integer.parseInt(b[1]),Boolean.parseBoolean(b[2]));
		Book book3 = new Book(c[0],Integer.parseInt(c[1]),Boolean.parseBoolean(c[2]));
		ArrayList <Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		Book max = books.get(0);
		for(Book x: books) {
			if(x.getPrice()>max.getPrice()) {
				max=x;
		}
		}
		

		System.out.println(max.getPrice()+" is more than price");
	}
	}
		
	
class Book{
private String brand;
private int price;
private boolean isbook;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isIsbook() {
	return isbook;
}
public void setIsbook(boolean isbook) {
	this.isbook = isbook;
}
public Book(String brand, int price, boolean isbook) {
	this.brand = brand;
	this.price = price;
	this.isbook = isbook;
}
public String toString() {
	return "Book [brand=" + brand + ", price=" + price + ", isbook=" + isbook + "]";
}

}
