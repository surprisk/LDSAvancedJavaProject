package model;

public class speciality {
	private String id;
	private String name;
	private int attack;
	private int defense;
	private int lifepoint;
	
	public speciality() {
		
	}
	
	public speciality(String id, String name, int attack, int defense, int lifepoint) {
		this.id = id;
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.lifepoint = lifepoint;
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
	 * @return the lifepoint
	 */
	public int getLifepoint() {
		return lifepoint;
	}
	/**
	 * @param lifepoint the lifepoint to set
	 */
	public void setLifepoint(int lifepoint) {
		this.lifepoint = lifepoint;
	}

	@Override
	public String toString() {
		String string = "\n\"Speciality\":{\n\"id\":\"" + this.id + "\"";
		string += this.name != null ? ",\n\"name\":\"" + this.name + "\"" : "";
		string += this.attack != 0 ? ",\n\"attack\":\"" + this.attack + "\"" : "";
		string += this.defense != 0 ? ",\n\"defense\":\"" + this.defense + "\"" : "";
		string += this.lifepoint != 0 ? ",\n\"lifepoint\":\"" + this.lifepoint + "\"" : "";
		return string += "\n}";
	}
	
	
}
