package _MedievalZone;

public class Enemy implements CombatActions{

	private String type;
	private int hp;
	private int def;
	private int dmg;
	private Inventory inventario;
	
	public Enemy() {
		
		Inventory inventario = new Inventory();
		this.inventario = inventario;
		this.hp = 100;
	}
	
	public void Hit(int dmg) {
		
		this.hp -= dmg;
	}
	@Override
	public void Attack(Weapon arma, Enemy e) {
		
	}
	public int Guard() {
		
		return 0;
	}
	public void UseItem() {
		
	}
	
	
	//Setters & getters
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	public Inventory getInventario() {
		return inventario;
	}
	public void setInventario(Inventory inventario) {
		this.inventario = inventario;
	}
}	
	
