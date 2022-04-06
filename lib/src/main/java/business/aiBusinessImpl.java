package business;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import data.aiDataMock;
import data.heroDataMock;
import model.ai;
import model.bag;
import model.hero;
import model.speciality;

public class aiBusinessImpl implements aiBusiness {
	List<ai> ais = aiDataMock.getList();
	 
	@Override
	public Optional<ai> get(String id) {
	    return ais.stream()
		        .filter(a -> Objects.equals(a.getId(), id))
		        .findFirst();
	}
	
	@Override
    public List<speciality> getSpecialities(String id){
    	return this.get(id)
    			.map(ai::getSpecialities)
    			.orElse(Collections.<speciality> emptyList());
    }
    
	@Override
	public Optional<bag> getBag(String id){
		return this.get(id)
				.map(ai::getBag);
    }
	
	@Override
    public Optional<hero> getParent(String id){
		return heroDataMock.getList().stream()
				.filter(h -> Objects.equals(h.getName(), this.get(id).isPresent() ? this.get(id).get().getName() : "") )
				.findFirst();
    }
	
	@Override
	public List<ai> getList() {
	    return ais;
	}
	
}
