package _MedievalZone;

public class Sword extends Weapon {
	
	int mult = 5;
	
	public Sword() {
		super(10, 20);
	}
	
	public Sword(int mod) {
		super(10, 20);
		modDmg(mod*mult);
		modWeight(mod*mult);
		
	}
	
	@Override
	public String toString() {
		return "This Weapon is a Sword With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
