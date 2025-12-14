package characters;

import java.util.ArrayList;
import java.util.List;

import Armor.*;
import Weapons.Weapon;
import consumibles.Consumible;


public class Inventory {
	
	

	 private Weapon weapon;
	 private Leggings pantalones;
	 private Helmet casco;
	 private Chestplate pechera;
	 
	 
	 private List<Consumible> consumibles;
	 
	 public Inventory() 
	 {
		 consumibles = new ArrayList<>();
	 }
	 
	 public Inventory(Weapon weapon, Armour armadura) 
	 {
		 
		this();
		this.weapon = weapon;
			
			
	 }
	 
	 public Inventory(Weapon weapon, Armour armadura, Consumible consumible ) 
	 {
		 this(weapon, armadura);
		 
		 consumibles.addLast(consumible);
	 }
	 
	 public void delConsum(Consumible consum) {
		 
		 consumibles.remove(consum);
	 }
	 public Weapon getWeapon() {
		 return weapon;
	 }
	 public void setWeapon(Weapon weapon) {
		 this.weapon = weapon;
	 }
	 
	 public List<Consumible> getConsumibles() {
		 return consumibles;
	 }
	 public void setConsumibles(List<Consumible> consumibles) {
		 this.consumibles = consumibles;
	 }
	 
	 @Override
	 
	 public String toString() {
		 
		 return "Tienes este arma " + weapon.toString() + ", esta armadura" + /*armor.toString() +*/ ", Y estos consumibles" + consumibles;
	 }
	 
	 
}
