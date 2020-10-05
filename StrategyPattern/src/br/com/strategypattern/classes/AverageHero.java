package br.com.strategypattern.classes;

import br.com.strategypattern.interfaces.IHero;
import br.com.strategypattern.interfaces.ISuperPower;

public class AverageHero implements IHero{

	ISuperPower superPower;
	
	public AverageHero() {
		superPower = new ISuperPower.Fly();
	}
	
	@Override
	public String usePower() {
		return superPower.doSomething();
	}
	
	public void changePower(ISuperPower newSuperPower) {
		superPower = newSuperPower;
	}
}
