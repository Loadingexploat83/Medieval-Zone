package _MedievalZone;

public class Clerigo extends Enemy{
	
	private int hp;
	private int def;
	private int dmg;
	public Clerigo() {
		
		this.def = 5;
		this.hp = 100;
		this.dmg = 3;
	}
	
	@Override
	public void Attack(Weapon arma, Enemy e) {
		
		dmg = arma.getDmg();
		e.Hit(dmg);
	}
	public void Guard() {
		
	}
	public void UseItem() {
		
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
}
