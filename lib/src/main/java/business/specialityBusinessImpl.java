package business;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import data.specialityDataMock;
import model.speciality;

public class specialityBusinessImpl implements specialityBusiness{
	
	List<speciality> specialities = specialityDataMock.getList();
	 
	@Override
	public Optional<speciality> get(String id) {
	    return specialities.stream()
		        .filter(s -> Objects.equals(s.getId(), id))
		        .findFirst();
	}
	
	@Override
	public List<speciality> getByAttack(int attack){
		return attack < 0 
				?
				specialities.stream()
					.filter(s -> s.getAttack() <= attack)
					.collect(Collectors.toList())
				:
				specialities.stream()
					.filter(s -> s.getAttack() >= attack)
					.collect(Collectors.toList());
	}
	
	@Override
	public List<speciality> getList() {
	    return specialities;
	}
}
