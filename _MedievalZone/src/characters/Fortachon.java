package characters;

import java.util.Scanner;

import Weapons.*;
import consumibles.*;
import Armor.*;
import java.util.List;

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
	public Fortachon(Weapon arma, Consumible consumible) {
		
		super();
	
		getInventario().getConsumibles().addLast(consumible);
		getInventario().setWeapon(arma);
		this.def = /*getInventario().getArmour().getDef()*/ 0;
		this.hp = 100;
		this.dmg = getInventario().getWeapon().getDmg();
	}
	
	@Override
	
	public void UseItem(Consumible consum) {
		
		consum.usar(this);
		getInventario().delConsum(consum);
	}
	
	public String toString() {
		
		return "Fortachon" + ", arma:" +getInventario().getWeapon() + ", armadura:" + getInventario().getArmour()+ 
				", consumibles:" + getInventario().getConsumibles();
	}
	
	public void habilidad(Enemy[] companeros) {
		
		int decision;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿A cual de tus compañeros les quieres subir el daño?: ");
		for(int i = 0; i < companeros.length; i++) {
			
			System.out.print(i + 1);
			System.out.print("-.");
			System.out.println(companeros[i].toString());
		}
		decision = sc.nextInt();
		switch(decision) {
			
			case 1:
				//companeros[0].aumentoFuerza(5);
				break;
			case 2:
				//companeros[1].aumentoFuerza(5);
				break;
			case 3:
				//companeros[2].aumentoFuerza(5);
				break;
			case 4:
				//companeros[3].aumentoFuerza(5);
		}		
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
