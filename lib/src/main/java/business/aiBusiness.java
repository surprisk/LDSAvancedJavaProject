package business;

import java.util.List;
import java.util.Optional;

import model.bag;
import model.hero;
import model.ai;
import model.speciality;

public interface aiBusiness {
	
    /**
     * Get ai by id
     *
     * @param id ai
     * @return ai
     */
    Optional<ai> get(String id);
    
    /**
     * Get hero's specialities by id
     *
     * @param id hero
     * @return List<speciality>
     */
    List<speciality> getSpecialities(String id);
    
    /**
     * Get hero's bag by id
     *
     * @param id hero
     * @return Optional<bag>
     */
    Optional<bag> getBag(String id);
    
    /**
     * Get ai's parent by id (if it has)
     *
     * @param id ai
     * @return Optional<hero>
     */
    Optional<hero> getParent(String id);
    
    /**
     * Get all speciality
     *
     * @return List<hero>
     */
    List<ai> getList();
}
