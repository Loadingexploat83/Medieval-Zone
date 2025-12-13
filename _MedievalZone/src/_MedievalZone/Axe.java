package _MedievalZone;

public class Axe extends Weapon {
	
	private int mult = 10;
	
	
	public Axe(){
		super(15,25);
	}
	
	public Axe(int mod){
		super(15,25);

		modDmg();
	}
	
	@Override
	public String toString() {
		return "This Weapon is an Axe With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
