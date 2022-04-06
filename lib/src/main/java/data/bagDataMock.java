package data;

import java.util.Arrays;
import java.util.List;

import enums.rarityEnums;
import model.bag;

public class bagDataMock {
	public static List<bag> getList(){
		return Arrays.asList(
			new bag("KpM1Bx", 2, 0 , itemDataMock.getItemsRarity(rarityEnums.LEGENDARY)),
			new bag("ZEHJCA", 4, 1000, itemDataMock.getItemsId()),
			new bag("lfm04L", 6, 2000, itemDataMock.getList())
		);
	}
}
