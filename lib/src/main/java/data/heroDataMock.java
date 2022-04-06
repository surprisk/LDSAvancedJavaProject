package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import enums.genderEnums;
import model.hero;

public class heroDataMock {
	public static List<hero> getList(){
		return Arrays.asList(
			new hero("2P2QMX", "Master Yi", specialityDataMock.getSpecialitiesId(), bagDataMock.getList().get(0), genderEnums.MALE, 25, 9000.0),
			new hero("3udcdA", "Karthus", specialityDataMock.getSpecialitiesName("Mage"), bagDataMock.getList().get(2), genderEnums.MALE, 999, 3000.0),
			new hero("fVEnsk", "Vi", Arrays.asList(specialityDataMock.getSpecialitiesId().get(1)), bagDataMock.getList().get(1), genderEnums.ANDROGYNE, 22, 2500.0),
			new hero("K4wtXK", "Jax", specialityDataMock.getList(), bagDataMock.getList().get(0), genderEnums.MALE, 35, 4201.11)
		);
	}
	
	/**
	 * Get heros with id "2P2QMX" and "K4wtXK"
	 * 
	 * @return List<hero> heroes
	 */
	
	public static List<hero> getHeroesId(){
		return getList().stream().filter(h -> h.getId() == "2P2QMX" || h.getId() == "K4wtXK").collect(Collectors.toList());
	}
	
	/**
	 * Get heroes by gender
	 * 
	 * @param genderEnums
	 * @return List<hero> heroes
	 */
	public static List<hero> getHeroesGender(genderEnums gender){
		return getList().stream().filter(h -> h.getGender() == gender).collect(Collectors.toList());
	}
}
