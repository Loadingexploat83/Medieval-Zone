package _MedievalZone;

import java.util.ArrayList;
import java.util.List;


public class Inventory {
	
	

	 private Weapon weapon;
	 private Armour armadura;
	 private List<Consumible> consumibles = new ArrayList<>();
	 
	 public Inventory(Weapon weapon, Armour armadura) 
	 {
		 	consumibles = new ArrayList<>();
			this.weapon = weapon;
			
			
	 }
	 
	 public Inventory(Weapon weapon, Armour armadura, Consumible consumible ) 
	 {
		 consumibles = new ArrayList<>();
		 this.weapon = weapon;
		 this.armadura = armadura;
		 
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
	 public Armour getArmor() {
		 return armadura;
	 }
	 public void setArmor(Armour armadura) {
		 this.armadura = armadura;
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
