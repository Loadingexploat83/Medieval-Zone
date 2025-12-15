package characters;

import Weapons.*;
import consumibles.*;
import Armor.*;
import java.util.List;

public class Caballero extends Enemy{

	
	private int hp;
	private int def;
	private int dmg;
	
	public Caballero() {
		
		super();
		this.def = 5;
		this.hp = 100;
		this.dmg = 3;
	}
	public Caballero(Armour armadura, Weapon arma) {
		
		super();
		this.hp = 100;
		getInventario().setWeapon(arma);
		getInventario().addArmour(armadura);
		this.def = getInventario().getDefPoints();
		this.dmg = getInventario().getWeapon().getDmg();
	}
	
	public void habilidad(Enemy[] companeros) {
		
		for(int i = 0; i < companeros.length; i++) {
			
			companeros[i].Guard(5);
		}
	}
	@Override
	public String toString() {
		
		return getName() + ", arma:" +getInventario().getWeapon() + ", armadura:" + getInventario().getArmour()+ 
				", consumibles:" + getInventario().getConsumibles();
	}
	
	
	//setters & getters
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
