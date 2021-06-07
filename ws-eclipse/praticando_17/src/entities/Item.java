package entities;

public class Item {
	
	private String name;
	private Double unitaryPrice;
	private Integer quantity;
	
	public Item() {
		
	}
	public Item(String name, Double unitaryPrice, Integer quantity) {
		this.name = name;
		this.unitaryPrice = unitaryPrice;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getUnitaryPrice() {
		return unitaryPrice;
	}
	public void setUnitaryPrice(Double unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double totalPrice() {
		return unitaryPrice * quantity;
	}
	

}
