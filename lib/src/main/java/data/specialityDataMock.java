package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.speciality;

public class specialityDataMock {
	public static List<speciality> getList(){
		return Arrays.asList(
			new speciality("pq4lQ3", "Combattant", 1000, 1000, 1000),
			new speciality("p6gNLG", "Tank", 500, 1250, 1500),
			new speciality("QpwaPV", "Mage", 2000, 1000, 750)
		);
	}
	
	/**
	 * Get speciality with id "pq4lQ3" and "p6gNLG"
	 * 
	 * @return List<speciality> specialities
	 */
	
	public static List<speciality> getSpecialitiesId(){
		return getList().stream().filter(s -> s.getId() == "pq4lQ3" || s.getId() == "p6gNLG").collect(Collectors.toList());
	}
	
	/**
	 * Get speciality by name
	 * 
	 * @param String name
	 * @return List<speciality> specialities
	 */
	public static List<speciality> getSpecialitiesName(String name){
		return getList().stream().filter(s -> s.getName() == name).collect(Collectors.toList());
	}
}
