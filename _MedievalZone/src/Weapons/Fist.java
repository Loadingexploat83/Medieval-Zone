package Weapons;

public class Fist extends Weapon{
	
	private static int baseDmg = 1;
	private static int baseWeight = 1;
	
	public Fist() {
		super(baseDmg,baseWeight);
	}
	
	@Override
	public String toString() {
		return "No llevas arma y tienes "+ getDmg() +" de Dmg y "+ getWeight()+ " de peso";
	}

}
