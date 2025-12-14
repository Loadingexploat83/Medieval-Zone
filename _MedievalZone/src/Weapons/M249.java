package Weapons;

public class M249 extends Weapon {
	
	private static int mult = 5;
	private static int baseDmg = 10;
	private static int baseWeight = 80;
	private int bullet;
	private double percent = 100f;
	
	public M249(){
		super(baseDmg, baseWeight);
		bullet = 20;
		percent = 50;
	}
	
	public M249(int mod){
		super(baseDmg, baseWeight);
		bullet = 20;
		percent = 50 + mod*mult;
	}
	
	public M249(int mod,int bullet ){
		super(baseDmg, baseWeight);
		this.bullet = bullet;
		percent = 50 + mod*mult;
	}
	
	public int getBullet() {
		return this.bullet;
	}
	
	public void addBullet() {
		this.bullet++;
	}
	
	public void addBullet(int num) {
		this.bullet += num;
	}
	
	//use this instead of getDmg();
	public int useM249() {
		int auxdmg = 0;
		int i = 0;
		double roll = Math.random()*100;
		while(roll<percent && bullet>0) {
			roll = Math.random()*100;
			auxdmg +=getDmg();
			percent = percent * 0.5;
			i++;
			this.bullet--;
		}
		System.out.println(i + "bolts have been use");
		return auxdmg;
	}
	
	

	@Override
	public String toString() {
		return "This Strange Weapon that Weighs " + getWeight() + " has " + getBullet() + " weird bolts that each has " + getDmg() + " attack damage.";
	}

}
