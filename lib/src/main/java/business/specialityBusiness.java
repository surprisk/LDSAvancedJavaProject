package business;

import java.util.List;
import java.util.Optional;

import model.speciality;

public interface specialityBusiness {
    /**
     * Get speciality by id
     *
     * @param id speciality
     * @return speciality
     */
    Optional<speciality> get(String id);
    
    List<speciality> getByAttack(int attack);
    
    /**
     * Get all speciality
     *
     * @return List<speciality>
     */
    List<speciality> getList();
}
