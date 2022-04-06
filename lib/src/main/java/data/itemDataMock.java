package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import enums.rarityEnums;
import model.item;

public class itemDataMock {
	/**
	 * Get all items
	 * 
	 * @return List<item> items
	 */
	public static List<item> getList(){
		return Arrays.asList(
			new item("D5zwbK", "Blade of the ruined king", 1500, 0, 0, 3, 3500, rarityEnums.RARE),
			new item("vMSF5c", "Ravenous Hydra", 1000, 0, 500, 3, 4000, rarityEnums.RARE),
			new item("I5DYEV", "Liandry's Lament", 3000, 500, 250, 10, 8000, rarityEnums.LEGENDARY),
			new item("J0Hq6r", "B. F. Sword", 500, 0, 0, 2, 1000, rarityEnums.COMMON),
			new item("pOxoD1", "Sunfire Aegis", 500, 2000, 1250, 10, 6500, rarityEnums.LEGENDARY)
		);
	}
	
	/**
	 * Get items with id "D5zwbK" and "I5DYEV"
	 * 
	 * @return List<item> items
	 */
	
	public static List<item> getItemsId(){
		return getList().stream().filter(i -> i.getId() == "D5zwbK" || i.getId() == "I5DYEV").collect(Collectors.toList());
	}
	
	/**
	 * Get items by rarity
	 * 
	 * @param rarityEnums
	 * @return List<item> items
	 */
	public static List<item> getItemsRarity(rarityEnums rarity){
		return getList().stream().filter(i -> i.getRarity() == rarity).collect(Collectors.toList());
	}
}
