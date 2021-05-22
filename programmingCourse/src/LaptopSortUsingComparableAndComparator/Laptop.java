package LaptopSortUsingComparableAndComparator;



public class Laptop implements Comparable<Laptop>{
	

public Laptop(String name, int price, int ram) {
		this.name = name;
		this.price = price;
		this.ram = ram;
	}
String name;
private int price;
private int ram;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
@Override
public int compareTo(Laptop laptopx) {
	if (this.getPrice()<laptopx.getPrice()) {
		return +2;
	}
	if (this.getPrice()>laptopx.getPrice()) {
		return -2;
	}
	else
	return 0;
}
@Override
public String toString() {
	return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + "]";
}




}

