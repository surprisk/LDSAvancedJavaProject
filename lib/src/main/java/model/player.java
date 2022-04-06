package model;

import java.util.List;
import java.util.stream.Collectors;

import enums.genderEnums;

public class player {
	private String id;
	private String nickname;
	private String password;
	private String mail;
	private genderEnums gender;
	private List<hero> heroes;
	
	public player() {
		
	}
	
	public player(String id, String nickname, String password, String mail, genderEnums gender, List<hero> heroes) {
		this.id = id;
		this.nickname = nickname;
		this.password = password;
		this.mail = mail;
		this.gender = gender;
		this.heroes = heroes;
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
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
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
	 * @return the heroes
	 */
	public List<hero> getHeroes() {
		return heroes;
	}

	/**
	 * @param heroes the heroes to set
	 */
	public void setHeroes(List<hero> heroes) {
		this.heroes = heroes;
	}
	
	@Override
	public String toString() {
		String string = "\n\"Player\":{\n\"id\":\"" + id + "\"";
		string += this.nickname != null ? ",\n\"nickname\":\"" + this.nickname + "\"" : "";
		string += this.password != null ? ",\n\"password\":\"" + this.password + "\"" : "";
		string += this.mail != null ? ",\n\"mail\":\"" + this.mail + "\"" : "";
		string += this.gender != null ? ",\n\"gender\":\"" + this.gender + "\"" : "";
		string += heroes != null ? ",\n\"heroes\":" + heroes.stream()
				.map(h -> h.toString())
				.collect(Collectors.toList()) : "";
		return string += "\n}";
	}
	
}
