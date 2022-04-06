package game;

import business.aiBusinessImpl;
import business.heroBusinessImpl;
import business.playerBusinessImpl;
import business.specialityBusinessImpl;
import data.aiDataMock;
import enums.genderEnums;

public class main {

	public static void main(String[] args) {

		//	SPECIALITY BUSINESS
        specialityBusinessImpl specialityBusiness = new specialityBusinessImpl();
        
        //		TEST
        System.out.println(":---   SPECIALITY   ---:");
        System.out.println("-  GET():  -");
        System.out.println("\nEXIST\n");
        System.out.println(specialityBusiness.get("pq4lQ3")); // EXIST
        System.out.println("\nDOESN'T EXIST\n");
        System.out.println(specialityBusiness.get("")); // DOESN'T EXIST
        
        System.out.println("-  GETBYATTACK():  -");
        System.out.println(specialityBusiness.getByAttack(1500)); // RETURN ALL SPECIALITY WITH ATTACK UPPER THAN 1500
        
        //System.out.println(specialityBusiness.getList()); COMMENTED BECAUSE OF FLOOD
        
        
		//--	SPECIALITY BUSINESS END
        
        
        
        //	AI BUSINESS
        aiBusinessImpl aiBusiness = new aiBusinessImpl();
        
        //		TEST
        System.out.println("\n:---   AI   ---:");
        System.out.println("-  GET():  -");
        System.out.println("\nEXIST\n");
        System.out.println(aiBusiness.get(aiDataMock.getAisId().get(0).getId())); // EXIST
        System.out.println("\nDOESN'T EXIST\n");
        System.out.println(aiBusiness.get("")); // DOESN'T EXIST
        
        System.out.println("-  GETSPECIALITIES():  -");
        System.out.println(aiBusiness.getSpecialities("DWxd20"));

        System.out.println("-  GETBAG():  -");
        System.out.println(aiBusiness.getBag("DWxd20"));

        System.out.println("-  GETPARENT():  -");
        System.out.println("\nHASN'T PARENT\n");
        System.out.println(aiBusiness.getParent("DWxd20"));
        System.out.println("\nHAS PARENT\n");
        System.out.println(aiBusiness.getParent("T4a96Q"));
        
        //System.out.println(aiBusiness.getList()); COMMENTED BECAUSE OF FLOOD
        
        //--	AI BUSINESS END
        
        
        
        //	HERO BUSINESS
        heroBusinessImpl heroBusiness = new heroBusinessImpl();
        
        //		TEST
        System.out.println(":---   HERO   ---:");
        System.out.println("-  GET():  -");
        System.out.println("\nEXIST\n");
        System.out.println(heroBusiness.get("2P2QMX")); // EXIST
        System.out.println("\nDOESN'T EXIST\n");
        System.out.println(heroBusiness.get("")); // DOESN'T EXIST
        
        System.out.println("-  GETSPECIALITIES():  -");
        System.out.println(heroBusiness.getSpecialities("2P2QMX"));

        System.out.println("-  GETBAG():  -");
        System.out.println(heroBusiness.getBag("2P2QMX"));
        
        //System.out.println(heroBusiness.getList()); COMMENTED BECAUSE OF FLOOD
        
        //--	HERO BUSINESS END
        
        
        
        //	PLAYER BUSINESS
        playerBusinessImpl playerBusiness = new playerBusinessImpl();
        
        //		TEST
        System.out.println(":---   PLAYER   ---:");
        
        System.out.println("-  GET():  -");
        System.out.println("\nEXIST\n");
        System.out.println(playerBusiness.get("ZnxK6e")); // EXIST
        System.out.println("\nDOESN'T EXIST\n");
        System.out.println(playerBusiness.get("")); // DOESN'T EXIST
        
        System.out.println("-  GETHEROES():  -");
        System.out.println(playerBusiness.getHeroes("ZnxK6e"));
        
        System.out.println("-  GETHEROESBYGENDER:  -");
        System.out.println("\nHAS MALE HERO\n");
        System.out.println(playerBusiness.getHeroesByGender("OdfKaM", genderEnums.MALE)); // "OdfKaM" PLAYER HAS MALE HERO
        System.out.println("\nHASN'T ANDROGYNE HERO\n");
        System.out.println(playerBusiness.getHeroesByGender("ZnxK6e", genderEnums.ANDROGYNE)); // "ZnxK6e" PLAYER HASN'T ANDRODYGNE HERO
        
        System.out.println("-  PLAYERGOLDS():  -");
        System.out.println(playerBusiness.playersGolds());
        
        //System.out.println(playerBusiness.getList()); COMMENTED BECAUSE OF FLOOD
        
        //--	PLAYER BUSINESS END

	}

}
