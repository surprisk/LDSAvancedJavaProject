package business;

import java.util.List;
import java.util.Optional;

import model.bag;
import model.hero;
import model.speciality;

public interface heroBusiness {
    /**
     * Get hero by id
     *
     * @param id hero
     * @return hero
     */
    Optional<hero> get(String id);
    
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
     * @return bag
     */
    Optional<bag>getBag(String id);
    
    /**
     * Get all speciality
     *
     * @return List<hero>
     */
    List<hero> getList();
}
