package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import enums.genderEnums;
import model.player;

public class playerDataMock {
	public static List<player> getList(){
		return Arrays.asList(
			new player("ZnxK6e", "Samuel", "passwordCrypté", "brosse.samuel91@gmail.com", genderEnums.MALE, heroDataMock.getHeroesGender(genderEnums.GENDERFLUID)),
			new player("OdfKaM", "Pierre", "passwordCrypté", "arnaudpierre29@gmail.com", genderEnums.CRINGENDER, heroDataMock.getHeroesId()),
			new player("4hbJaj", "Diarra", "passwordCrypté", "diarra176@gmail.com", genderEnums.MALE, heroDataMock.getList())
		);
	}
	
	/**
	 * Get players with id "ZnxK6e" and "OdfKaM"
	 * 
	 * @return List<player> players
	 */
	
	public static List<player> getPlayersId(){
		return getList().stream().filter(p -> p.getId() == "ZnxK6e" || p.getId() == "OdfKaM").collect(Collectors.toList());
	}
	
	/**
	 * Get players by gender
	 * 
	 * @param genderEnums
	 * @return List<player> players
	 */
	public static List<player> getPlayersGender(genderEnums gender){
		return getList().stream().filter(p -> p.getGender() == gender).collect(Collectors.toList());
	}
}
