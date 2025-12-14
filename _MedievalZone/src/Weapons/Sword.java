package Weapons;

public class Sword extends Weapon {
	
	private static int mult = 5;
	private static int baseDmg = 10;
	private static int baseWeight = 20;
	private int percentage = 10;
	
	public Sword() {
		super(baseDmg,baseWeight);
	}
	
	public Sword(int mod) {
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
	}
	
	public int behead() {
		if(Math.random()*100< percentage) {
			System.out.println("You have beheaded the Enemy");
			return getDmg()*1000;
		}else {
			System.out.println("The Enemy dodge the Attack");
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "This Weapon is a Sword With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
