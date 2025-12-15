package Weapons;

public class Hammer extends Weapon {
	
	private static int mult = 30;
	private static int baseDmg = 40;
	private static int baseWeight = 50;
	private int percentage = 50;

	public Hammer() {
		super(baseDmg,baseWeight);
	}
	
	public Hammer(int mod) {
		super(baseDmg,baseWeight);
		modifica(mod);
	}
	
	public int slam() {
		if(Math.random()*100< percentage){
			System.out.println("Slam failed");
			return 0;
		}else {
			System.out.println("the Slam has shaken the floor the Enemy is Stuned for the next N/A turns.");
			return 1;
		}
	}
	
	public int useWeapon() {
		return getDmg();
	}


}
