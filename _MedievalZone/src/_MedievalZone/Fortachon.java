package _MedievalZone;

public class Fortachon extends Enemy{

	private int hp;
	private int def;
	private int dmg;
	public Fortachon() {
		
		super();
		this.def = 5;
		this.hp = 100;
		this.dmg = 3;
	}
	
	@Override
	public void Attack(Weapon arma, Enemy e) {
		
		dmg = arma.getDmg() - Guard();
		e.Hit(dmg);
	}
	public int Guard() {
		
		def = getInventario().getArmor().getDef();
		
		return def;
	}
	public void UseItem(Consumible consum) {
		
		consum.Action(this);
		getInventario().delConsum(consum);
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
