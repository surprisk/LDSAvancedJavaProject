package model;

import enums.rarityEnums;

public class item {
	private String id;
	private String name;
	private int attack;
	private int lifepoint;
	private int defense;
	private int durability;
	private double cost;
	private rarityEnums rarity;
	
	public item() {
		
	}
		
	public item(String id, String name, int attack, int lifepoint, int defense, int durability, double cost, rarityEnums rarity) {
		this.id = id;
		this.name = name;
		this.attack = attack;
		this.lifepoint = lifepoint;
		this.defense = defense;
		this.durability = durability;
		this.cost = cost;
		this.rarity = rarity;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	/**
	 * @return the speed
	 */
	public int getLifepoint() {
		return lifepoint;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setLifepoint(int lifepoint) {
		this.lifepoint = lifepoint;
	}
	/**
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}
	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/**
	 * @return the durability
	 */
	public int getDurability() {
		return durability;
	}
	/**
	 * @param durability the durability to set
	 */
	public void setDurability(int durability) {
		this.durability = durability;
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
	 * @return the rarity
	 */
	public rarityEnums getRarity() {
		return rarity;
	}
	/**
	 * @param rarity the rarity to set
	 */
	public void setRarity(rarityEnums rarity) {
		this.rarity = rarity;
	}
	
	@Override
	public String toString() {
		String string = "\n\"Item\":{\n\"id\":\"" + this.id + "\"";
		string += this.name != null ? ",\n\"name\":\"" + this.name + "\"" : "";
		string += this.attack != 0 ? ",\n\"attack\":\"" + this.attack + "\"" : "";
		string += this.defense != 0 ? ",\n\"defense\":\"" + this.defense + "\"" : "";
		string += this.lifepoint != 0 ? ",\n\"lifepoint\":\"" + this.lifepoint + "\"" : "";
		string += this.durability != 0 ? ",\n\"durability\":\"" + this.durability + "\"" : "";
		string += this.cost != 0 ? ",\n\"cost\":\"" + this.cost + "\"" : "";
		string += this.rarity != null ? ",\n\"rarity\":\"" + this.rarity + "\"" : "";
		
		return string += "\n}";
	}
	
}
