package characters;

import Weapons.*;
import consumibles.*;
import Armor.*;
import java.util.List;

public class Scout extends Enemy{


	private int hp;
	private int def;
	private int dmg;
	
	public Scout() {
		
		super();
		this.def = 5;
		this.hp = 100;
		this.dmg = 3;
	}
	public Scout(Consumible consumible) {
		
		super();
		
		this.hp = 100;
		getInventario().getConsumibles().addLast(consumible);
		this.dmg = getInventario().getWeapon().getDmg();
	}
	
	public void habilidad(Enemy[] companeros) {
		
		int randomNum = 0;
		int secondRand = 0;
		Armour armadura = new Helmet();
		Weapon arma = new Dagger();
		Consumible c = new PociondeVida();
		
		for(int i = 0; i < 2; i++) {
			
			randomNum = (int) (Math.random() * 3) + 1;
			secondRand = (int) (Math.random() * 2) + 1;
			switch(randomNum) {
			
				case 1:
					getInventario().setWeapon(arma);
					break;
				case 2:
					getInventario().setArmour(armadura);
					break;
				case 3:
					if(secondRand == 1) {
						
						if(getInventario().getConsumibles() != null) {
							
							getInventario().getConsumibles().removeFirst();
							System.out.println("Se ha roto una de tus pociones");
						}
					}else {
						
						getInventario().getConsumibles().addLast(c);
					}
					break;
			}
		}
	}
	
	@Override
	public void Attack(Weapon arma, Enemy e) {
		
		dmg = arma.getDmg() - e.getInventario().getArmour().getDef();
		e.Hit(dmg);
	}
	public int Guard(int aumento) {
		
		int newDef = getInventario().getArmour().getDef() + aumento;
		getInventario().getArmour().setDef (newDef);
		System.out.println("Tu defensa ha aumentado");
		return def;
	}
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
