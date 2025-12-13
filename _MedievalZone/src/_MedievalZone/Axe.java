package _MedievalZone;

public class Axe extends Weapon {
	
	private static int mult = 10;
	private static int baseDmg = 15;
	private static int baseWeight = 25;
	
	
	public Axe(){
		super(baseDmg,baseWeight);
	}
	
	public Axe(int mod){
		super(baseDmg,baseWeight);

		modDmg(mod*mult);
		modWeight(mod*mult);
	}
	
	@Override
	public String toString() {
		return "This Weapon is an Axe With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
