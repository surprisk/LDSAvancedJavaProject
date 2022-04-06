package business;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.heroDataMock;
import model.bag;
import model.hero;
import model.speciality;

public class heroBusinessImpl implements heroBusiness {
	
	List<hero> heroes = heroDataMock.getList();
	 
	@Override
	public Optional<hero> get(String id) {
	    return heroes.stream()
		        .filter(h -> Objects.equals(h.getId(), id))
		        .findFirst();
	}
	
	@Override
	public List<speciality> getSpecialities(String id){
    	return this.get(id)
    			.map(hero::getSpecialities)
    			.orElse(Collections.<speciality> emptyList());
    }
    
	@Override
	public Optional<bag> getBag(String id){
    	/*return heroes.stream()
    		.filter(h -> Objects.equals(h.getId(), id))
    		.findFirst()
    		.map(hero::getBag);*/
		return this.get(id)
				.map(hero::getBag);
    }
	
	
	
	@Override
	public List<hero> getList() {
	    return heroes;
	}
	
}
