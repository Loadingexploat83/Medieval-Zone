package _MedievalZone;

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
	
	//adds modifier to the damage
	public void modDmg(int mod) {
		this.dmg += mod;
	}
	
	//devuelve Weight value
	public int getWeight() {
		return weight;
	}
	
	//adds modifier to the weight
	public void modWeight(int mod) {
		this.weight += mod;
	}
	
	//needs for each Weapon
	@Override
	public abstract String toString();
	
}
