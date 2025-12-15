package characters;

import Weapons.*;
import consumibles.*;
import Armor.*;
import java.util.List;

public class Ladron extends Enemy{

	private int hp;
	private int def;
	private int dmg;
	
	public Ladron() {
		
		super();
		this.def = 5;
		this.hp = 100;
		this.dmg = 3;
	}
	public Ladron(Weapon arma, Consumible consumible) {
		
		super();
		
		this.hp = 100;
		getInventario().getConsumibles().addLast(consumible);
		getInventario().setWeapon(arma);
		this.def = 0;
		this.dmg = getInventario().getWeapon().getDmg();
	}
	
	public void habilidad(Enemy[] companeros) {
		
		int randomNum = (int) (Math.random() * companeros.length);
		Consumible consum;
		
		if(getInventario().getConsumibles().getFirst() != null) {
		
			consum = companeros[randomNum].getInventario().getConsumibles().getFirst();
			this.getInventario().getConsumibles().addLast(consum);
		}else {
			
			System.out.println("Robo fallido");
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
