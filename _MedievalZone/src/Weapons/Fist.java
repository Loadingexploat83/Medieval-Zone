package Weapons;

public class Fist extends Weapon{
	
	private static int baseDmg = 1;
	private static int baseWeight = 1;
	
	public Fist() {
		super(baseDmg,baseWeight);
	}
	public Fist(int mod) {
		super(baseDmg,baseWeight);
		modifica(mod);
	}
	
	public int useWeapon(){
		return getDmg();
	}
	
	@Override
	public String toString() {
		return "No llevas arma y tienes "+ getDmg() +" de Dmg y "+ getWeight()+ " de peso";
	}

}
