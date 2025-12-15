package characters;

import java.util.ArrayList;
import java.util.List;

import Weapons.Fist;
import Weapons.Weapon;
import Armor.Armour;
//import Armor.Chestplate;
//import Armor.Helmet;
//import Armor.Leggings;
import consumibles.Consumible;



public class Inventory {
	
	

	 private Weapon weapon;
	 private Armour armour;
	 /*private Leggings pantalones;
	 private Helmet casco;
	 private Chestplate pechera;*/
	 
	 
	 private List<Consumible> consumibles;
	 
	 public Inventory() 
	 {
		 consumibles = new ArrayList<>();
		 this.weapon = new Fist();
	 }
	 
	 public Inventory(Weapon weapon, Armour armadura) 
	 {
		 
		this();
		this.weapon = weapon;
			
			
	 }
	 
	 public Inventory(Weapon weapon, Armour armadura, Consumible consumible ) 
	 {
		 this(weapon, armadura);
		 
		 consumibles.add(consumible);
	 }
	 
	 public void addConsum(Consumible consum) {
		 consumibles.add(consum);
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
	 
	 public Armour getArmour() {
			return armour;
		}

		 public void setArmour(Armour armour) {
			 this.armour = armour;
		 }

	 
	 @Override
	 
	 public String toString() {
		 
		 return "Tienes este arma: " + weapon.toString() + 
				 ", esta armadura" + /*armor.toString() +*/ 
				 ", Y estos consumibles" + consumibles;
	 }
	 
	 
}
