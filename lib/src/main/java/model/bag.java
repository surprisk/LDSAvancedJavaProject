package model;

import java.util.List;
import java.util.stream.Collectors;

public class bag {
	private String id;
	private int size;
	private double cost;
	private List<item> items;
	
	public bag() {
		
	}
	
	public bag(String id, int size, double cost) {
		this.id = id;
		this.size = size;
		this.cost = cost;
	}
	
	public bag(String id, int size, double cost, List<item> items) {
		this.id = id;
		this.size = size;
		this.cost = cost;
		this.items = items;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the items
	 */
	public List<item> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<item> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		String string = "\n\"Bag\":{\n\"id\":\"" + this.id + "\"";
		string += this.size != 0 ? ",\n\"size\":\"" + this.size + "\"" : "";
		string += this.cost != 0 ? ",\n\"cost\":\"" + this.cost + "\"" : "";
		string += this.items != null ? ",\n\"items\":" + items.stream()
				.map(i -> i.toString())
				.collect(Collectors.toList()) : "";
		
		return string += "\n}";
	}

}
