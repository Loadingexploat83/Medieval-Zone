package _MedievalZone;

import java.util.ArrayList;
import java.util.List;


public class Inventory {

	 private Weapon weapon;
	 private Armadura armor;
	 private List<Consumible> consumibles = new ArrayList<>();
	 
	 
	 public void delConsum(Consumible consum) {
		 
		 consumibles.remove(consum);
	 }
	 public Weapon getWeapon() {
		 return weapon;
	 }
	 public void setWeapon(Weapon weapon) {
		 this.weapon = weapon;
	 }
	 public Armadura getArmor() {
		 return armor;
	 }
	 public void setArmor(Armadura armor) {
		 this.armor = armor;
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
