package business;

import java.util.List;
import java.util.Optional;

import enums.genderEnums;
import model.player;
import model.hero;

public interface playerBusiness {
    /**
     * Get player by id
     *
     * @param id player
     * @return Optional<player>
     */
    Optional<player> get(String id);
    
    /**
     * Get player's heroes by id
     *
     * @param id player
     * @return List<hero>
     */
    List<hero> getHeroes(String id);
    
    /**
     * Get player's heroes by id with specific gender
     *
     * @param id player
     * @param gender hero
     * @return List<hero>
     */
    List<hero> getHeroesByGender(String id, genderEnums gender);
    
    /**
     * Sum all player's golds
     * 
     * @return double
     */
    double playersGolds();
    
    /**
     * Get all players
     *
     * @return List<player>
     */
    List<player> getList();
}
