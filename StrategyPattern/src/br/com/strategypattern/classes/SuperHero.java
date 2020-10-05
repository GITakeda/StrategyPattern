package br.com.strategypattern.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.strategypattern.interfaces.IHero;
import br.com.strategypattern.interfaces.ISuperPower;
import br.com.strategypattern.interfaces.ISuperPower.ShootLaser;

public class SuperHero implements IHero{

	List<ISuperPower> superPowers;
	
	public SuperHero() {
		superPowers = new ArrayList<>();
		superPowers.add(new ISuperPower.Fly());
		superPowers.add(new ISuperPower.ShootLaser());
	}
	
	@Override
	public String usePower() {
		return superPowers.get((int) (Math.random() * superPowers.size())).doSomething();
	}
	
	public void giveMorePowers(ISuperPower newSuperPower) {
		superPowers.add(newSuperPower);
	}
	
}
