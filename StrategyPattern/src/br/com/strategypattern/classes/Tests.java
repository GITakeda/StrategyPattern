package br.com.strategypattern.classes;

import br.com.strategypattern.interfaces.ISuperPower;

public class Tests {

	public static void main(String args[]) {
		AverageHero averageHero = new AverageHero();
		
		System.out.println(averageHero.usePower());
		
		averageHero.changePower(new ISuperPower.ShootLaser());
		
		System.out.println(averageHero.usePower());
		
		SuperHero superHero = new SuperHero();
		
		System.out.println(superHero.usePower());
		System.out.println(superHero.usePower());
	}
	
}
