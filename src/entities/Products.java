package entities;

import java.util.Objects;

public class Products implements Comparable <Product> {
	private String name;
	private Double price;
	
	public Products(String name, Double price) {
	this.name = name;
	this.price = price;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public Double getPrice() {
	return price;
	}
	public void setPrice(Double price) {
	this.price = price;
}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (name ==null) {
			return false;
		}else if (!name.equals(other.name))
		return false;
		if (price == null) {
			if(other.price != null)
				return false;
		}else if (!price.equals(other.price))
			return false;
		return true;
		
		}
		
	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + "]";
	}
@Override
	public int compareTo(Product other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	
}
}
