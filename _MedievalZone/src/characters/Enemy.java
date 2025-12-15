package characters;

import Armor.Armour;
import Weapons.Weapon;
import _MedievalZone.CombatActions;
import consumibles.Consumible;

public abstract class Enemy implements CombatActions{

	private String type;
	private String name;
	
	private int hp;
	private int maxHp = 100;
	private int def;
	private int dmg;
	private Inventory inventario;
	
	public Enemy() {
		this.inventario = new Inventory();
		this.hp = maxHp;
	
	}
	
	public Enemy(Weapon weapon) {
		this.inventario = new Inventory(weapon);
		this.hp = maxHp;
	}
		
	public Enemy(Weapon weapon, Consumible consumible) {
			
			this.inventario = new Inventory(weapon, consumible);
			this.hp = maxHp;
	}
	
	
	
	public void Hit(int dmg) {
		
		if(dmg <= 0) {
			
			dmg = 1;
		}
		this.hp -= dmg;
	}
	public void aumentarFuerza(int aumento) {
		
		if(getInventario().getWeapon() != null) {
			
			dmg = getInventario().getWeapon().getDmg() + aumento;
			getInventario().getWeapon().setDmg(dmg);
			
		}else {
			
			this.dmg += aumento;
		}
	}
	
	@Override
	public void Attack(Weapon arma, Enemy e) {
		
		try {
		dmg = arma.useWeapon() / e.getInventario().getDefPoints();
		} catch (ArithmeticException err) {
			dmg = arma.useWeapon();
		}
		System.out.println(name + " a atacado por " + dmg + " de DMG a " +e.getName());
		e.Hit(dmg);
	}
	public int Guard(int aumento) {
		
		if(getInventario().getArmour() != null) {
			def = ((Armour) getInventario().getArmour()).getDef() + aumento;
			((Armour) getInventario().getArmour()).setDef(def);
			System.out.println("Tu defensa ha aumentado");
		}else {
			
			this.def += aumento;
		}
		
		return def;
	}
	public void UseItem(Consumible consum) {
		
		consum.usar(this);
		getInventario().delConsum(consum);
	}
	
	
	public int healHP(int heal) 
	{
		int healthOld = this.hp;
		int actualHeal;
		this.hp += heal;
		this.hp = Math.clamp(hp, 0, maxHp);
		
		
		actualHeal = this.hp - healthOld;
		
		System.out.println(name + " se a curado " + actualHeal);
		return actualHeal;
	}
	
	
	//Setters & getters
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
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
		return def + inventario.getDefPoints();
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
	
	public String toString() {
		
		return name + ", arma:" +getInventario().getWeapon() + ", armadura:" + getInventario().getArmour()+ 
				", consumibles:" + getInventario().getConsumibles();
	}
}	
	
