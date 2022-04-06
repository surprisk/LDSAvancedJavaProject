package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import enums.difficultyEnums;
import enums.genderEnums;
import model.ai;

public class aiDataMock {
	public static List<ai> getList(){
		return Arrays.asList(
			new ai("DWxd20", "Veigar", specialityDataMock.getSpecialitiesId(), bagDataMock.getList().get(0), genderEnums.MALE, 10000, 10000, difficultyEnums.HARD),
			new ai("pjVO6f", "Red", specialityDataMock.getSpecialitiesName("Tank"), bagDataMock.getList().get(1), genderEnums.GENDERLESS, 10000, 300, difficultyEnums.EASY),
			new ai(heroDataMock.getList().get(0), difficultyEnums.HARD),
			new ai(heroDataMock.getList().get(1), difficultyEnums.MEDIUM),
			new ai("T4a96Q", heroDataMock.getList().get(1), difficultyEnums.HARD)
		);
	}
	
	/**
	 * Get ais with id "DWxd20" and "T4a96Q"
	 * 
	 * @return List<ai> ais
	 */
	
	public static List<ai> getAisId(){
		return getList().stream().filter(a -> a.getId() == "DWxd20" || a.getId() == "T4a96Q").collect(Collectors.toList());
	}
	
	/**
	 * Get ais by gender
	 * 
	 * @param genderEnums
	 * @return List<ai> ais
	 */
	public static List<ai> getAisGender(genderEnums gender){
		return getList().stream().filter(a -> a.getGender() == gender).collect(Collectors.toList());
	}
}
