package Weapons;

public class Dagger extends Weapon {
	
	private static int mult = 2;
	private static int baseDmg = 5;
	private static int baseWeight = 5;
	private int percent = 30;
	
	public Dagger(){
		super(baseDmg,baseWeight);
	}
	
	public Dagger(int mod){
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
	}
	
	
	public int useDagger() {
		if(Math.random()*100 >percent) {
			return getDmg();
		}else {
			System.out.println("Player performed doouble hit.");
			return getDmg()*2;
		}
	}
	
	@Override
	public String toString() {
		return "This Weapon is a Dagger with "+ getDmg() + " Attack and " + getWeight() + " Weight.";
	}

}
