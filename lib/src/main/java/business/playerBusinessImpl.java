package business;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import data.playerDataMock;
import enums.genderEnums;
import model.hero;
import model.player;

public class playerBusinessImpl implements playerBusiness {
	private List<player> players = playerDataMock.getList();
	 
	@Override
	public Optional<player> get(String id) {
	    return players.stream()
		        .filter(p -> Objects.equals(p.getId(), id))
		        .findFirst();
	}
	
	@Override
	public List<hero> getHeroes(String id){
    	return this.get(id)
    			.map(player::getHeroes)
    			.orElse(Collections.<hero> emptyList());
    }
	
	@Override
	public List<hero> getHeroesByGender(String id, genderEnums gender){
    	return this.get(id)
    			.map(p -> p.getHeroes().stream()
    						.filter(h -> h.getGender() == gender)
    						.collect(Collectors.toList())
    			)
    			.orElse(Collections.<hero> emptyList());
    }
	
	@Override
	public double playersGolds(){
		return players.stream()
				.map(p -> p.getHeroes().stream()
							.map(h -> h.getGolds())
							.reduce(0.0, (sub, golds) -> sub + golds )
						+ p.getHeroes().stream()
							.map(hero::getBag)
							.map(b -> b.getItems().stream()
									.map(i -> i.getCost())
									.reduce(0.0, (sub, golds) -> sub + golds )
							)
							.reduce(0.0, (sub, golds) -> sub + golds)
				)
				.reduce(0.0, (sub, golds) -> sub + golds);
	}
    
	@Override
	public List<player> getList() {
	    return players;
	}
}
