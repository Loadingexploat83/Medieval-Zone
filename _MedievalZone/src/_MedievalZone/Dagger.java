package _MedievalZone;

public class Dagger extends Weapon {
	
	private static int mult = 2;
	private static int baseDmg = 5;
	private static int baseWeight = 5;
	
	public Dagger(){
		super(baseDmg,baseWeight);
	}
	
	public Dagger(int mod){
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
	}
	
	@Override
	public String toString() {
		return "This Weapon is a Dagger with "+ getDmg() + " Attack and " + getWeight() + " Weight.";
	}

}
