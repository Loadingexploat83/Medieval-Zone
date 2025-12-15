package characters;

import Weapons.*;
import consumibles.*;
import Armor.*;
import java.util.List;

public class Clerigo extends Enemy{
	
	private int hp;
	private int def;
	private int dmg;
	
	public Clerigo() {
		
		super();
		this.def = 5;
		this.hp = 100;
		this.dmg = 3;
	}
	public Clerigo(Armour armadura, Consumible consumible) {
		
		super();
		
		this.hp = 100;
		getInventario().getConsumibles().addLast(consumible);
		getInventario().setArmour(armadura);
		this.def = getInventario().getArmour().getDef();
		this.hp = 100;
		this.dmg = 5; //Aqui poner punyos cuando esten acabados
	}
	
	public void habilidad(Enemy[] companeros) {
		
		for(int i = 0; i < companeros.length; i++) {
			
			companeros[i].healHP(10);
		}
	}
	
	@Override
	
	public void UseItem(Consumible consum) {
		
		consum.usar(this);
		getInventario().delConsum(consum);
	}
	
	public String toString() {
		
		return "Clerigo" + ", arma:" +getInventario().getWeapon() + ", armadura:" + getInventario().getArmour()+ 
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
