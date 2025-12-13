package _MedievalZone;

public class Dagger extends Weapon {
	
	private int mult = 2;
	
	public Dagger(){
		super(5,5);
	}
	
	public Dagger(int mod){
		super(5,5);
		modDmg(mod*mult);
		modWeight(mod*mult);
	}
	
	@Override
	public String toString() {
		return "This Weapon is a Dagger with "+ getDmg " Attack and " + Weight+ " Weight.";
	}

}
