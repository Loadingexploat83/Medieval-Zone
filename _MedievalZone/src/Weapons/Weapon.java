package Weapons;

public abstract class Weapon {
	//atributos
	private int dmg;
	private int weight;
	
	public Weapon(int dmg, int weight){
		this.dmg = dmg;
		this.weight = weight; 
	}

	//devuelve Damage value
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}

	//adds modifier to the damage
	public void modDmg(int mod) {
		this.dmg += mod;
		if(this.dmg<=0) this.dmg = 1;
	}
	
	//devuelve Weight value
	public int getWeight() {
		return weight;
	}
	
	//adds modifier to the weight
	public void modWeight(int mod) {
		this.weight += mod;
	}
	
	
	public abstract int useWeapon();
	
	//needs for each Weapon
	@Override
	public String toString() {
		return getClass().getSimpleName() + " con " + getDmg() +" Attack and "+ getWeight()+ " Weight";
	}
	
	public int useEnemyWeapon() {
		return getDmg();
	}

	
}
