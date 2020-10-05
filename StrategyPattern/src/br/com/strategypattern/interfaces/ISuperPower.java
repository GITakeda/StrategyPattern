package br.com.strategypattern.interfaces;

public interface ISuperPower {
	String doSomething();
	
	public class Fly implements ISuperPower{
		@Override
		public String doSomething() {
			return "I'm flying! ^^ ^^ ^^ ^^";
		}
	}
	
	public class ShootLaser implements ISuperPower{
		@Override
		public String doSomething() {
			return "Laser attack! -- -- -- -- -- ";
		}
	}
}


