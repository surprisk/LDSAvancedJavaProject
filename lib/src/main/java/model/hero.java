package model;

import java.util.List;
import java.util.stream.Collectors;

import enums.genderEnums;

public class hero {
	private String id;
	private String name;
	private List<speciality> specialities;
	private model.bag bag;
	private genderEnums gender;
	private int age;
	private double golds;
	
	public hero() {
		
	}
	
	public hero(String id, String name, List<speciality> specialities, model.bag bag, genderEnums gender, int age, double golds) {
		this.id = id;
		this.name = name;
		this.specialities = specialities;
		this.bag = bag;
		this.gender = gender;
		this.age = age;
		this.golds = golds;
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
	 * @return the specialities
	 */
	public List<speciality> getSpecialities() {
		return specialities;
	}

	/**
	 * @param specialities the specialities to set
	 */
	public void setSpecialities(List<speciality> specialities) {
		this.specialities = specialities;
	}

	/**
	 * @return the bag
	 */
	public bag getBag() {
		return bag;
	}

	/**
	 * @param bag the bag to set
	 */
	public void setBag(bag bag) {
		this.bag = bag;
	}

	/**
	 * @return the gender
	 */
	public genderEnums getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(genderEnums gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the golds
	 */
	public double getGolds() {
		return golds;
	}

	/**
	 * @param golds the golds to set
	 */
	public void setGolds(double golds) {
		this.golds = golds;
	}
	
	@Override
	public String toString() {
		String string = "\n\"Hero\":{\n\"id\":\"" + this.id + "\"";
		string += this.name != null ? ",\n\"name\":\"" + this.name + "\"" : "";
		string += this.specialities != null ? ",\n\"specialities\":" + specialities.stream()
				.map(s -> s.toString())
				.collect(Collectors.toList()) : "";
		string += this.bag != null ? "," +  this.bag.toString() : "";
		string += this.gender != null ? ",\n\"gender\":\"" +  this.gender +  "\"" : "";
		string += this.age != 0 ? ",\n\"age\":" +  this.age + "" : "";
		string += this.golds != 0 ? ",\n\"golds\":\"" +  this.golds +  "\"" : "";
		
		return string += "\n}";
	}
	
}
