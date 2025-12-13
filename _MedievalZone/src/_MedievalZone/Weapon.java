package _MedievalZone;

public abstract class Weapon {
	private int dmg;
	private int weight;
	
	public Weapon(int dmg, int weight){
		this.dmg = dmg;
		this.weight = weight; 
	}

	public int getDmg() {
		return dmg;
	}

	public void modDmg(int mod) {
		this.dmg += mod;
	}

	public int getWeight() {
		return weight;
	}

	public void modWeight(int mod) {
		this.weight += mod;
	}
	
	@Override
	public abstract String toString();
	
}
