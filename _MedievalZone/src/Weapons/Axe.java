package Weapons;

public class Axe extends Weapon {
	
	private static int mult = 10;
	private static int baseDmg = 15;
	private static int baseWeight = 25;
	private int percent = 10;
	
	
	public Axe(){
		super(baseDmg,baseWeight);
	}
	
	public Axe(int mod){
		super(baseDmg,baseWeight);

		modDmg(mod*mult);
		modWeight(mod*mult);
	}
	
	public int useWeapon() {
		if(Math.random()*100<percent) {
			System.out.println("instead of hitting the enemy you hit their Weapon");
			//enemyWeapon.modDmg(-baseDmg);
			return 0;
		}else {
			return getDmg();
		}
	}
	
	@Override
	public String toString() {
		return "This Weapon is an Axe With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
