package algorithm.day5;

/**
 * @author 82103
 * 2023. 1. 25.
 * Data를 표현, DB table 의 레코드와 Mapping Data를 저장하는 객체 : Entity Object, Value Object
 */
public class Product {
	private String name;
	private int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
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
}
