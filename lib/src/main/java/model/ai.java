package model;

import java.util.List;
import java.util.stream.Collectors;

import enums.difficultyEnums;
import enums.genderEnums;

public class ai extends hero{
	private difficultyEnums difficulty;
	
    /**
     * Constructor of empty ai
     * 
     */
	public ai() {
		
	}
	
    /**
     * Constructor of ai with hero
     *
     * @param id ai
     * @return ai
     */
	public ai(hero hero, difficultyEnums difficulty) {
		super(hero.getId(), hero.getName(), hero.getSpecialities(), hero.getBag(), hero.getGender(), hero.getAge(), hero.getGolds());
		this.difficulty = difficulty;
	}
	
	
	public ai(String id, hero hero, difficultyEnums difficulty) {
		super(id, hero.getName(), hero.getSpecialities(), hero.getBag(), hero.getGender(), hero.getAge(), hero.getGolds());
		this.difficulty = difficulty;
	}

	public ai(String id, String name, List<speciality> specialities, bag bag, genderEnums gender, int age, float golds, difficultyEnums difficulty) {
		super(id, name, specialities, bag, gender, age, golds);
		this.difficulty = difficulty;
	}

	/**
	 * @return the difficulty
	 */
	public difficultyEnums getDifficulty() {
		return difficulty;
	}

	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(difficultyEnums difficulty) {
		this.difficulty = difficulty;
	}
	
	@Override
	public String toString() {
		String string = "\n\"Ai\":{\n\"id\":\"" + this.getId() + "\"";
		string += this.getName() != null ? ",\n\"name\":\"" + this.getName() + "\"" : "";
		string += this.getSpecialities() != null ? ",\n\"specialities\":" + this.getSpecialities().stream()
				.map(s -> s.toString())
				.collect(Collectors.toList()) : "";
		string += this.getBag() != null ? "," +  this.getBag().toString() +  "\"" : "";
		string += this.getGender() != null ? ",\n\"gender\":\"" +  this.getGender() +  "\"" : "";
		string += this.getAge() != 0 ? ",\n\"age\":" +  this.getAge() + "" : "";
		string += this.getGolds() != 0 ? ",\n\"golds\":\"" +  this.getGolds() +  "\"" : "";
		string += this.difficulty != null ? ",\n\"difficulty\":\"" +  this.difficulty +  "\"" : "";
		
		return string += "\n}";
	}
	
}
