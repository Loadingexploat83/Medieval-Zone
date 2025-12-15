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
	 private List<Armour> armour;
	 /*private Leggings pantalones;
	 private Helmet casco;
	 private Chestplate pechera;*/
	 
	 
	 private List<Consumible> consumibles;
	 
	 public Inventory() 
	 {
		 consumibles = new ArrayList<>();
		 armour = new ArrayList<>();
		 this.weapon = new Fist();
	 }
	 
	 public Inventory(Weapon weapon) 
	 {
		 
		this();
		this.weapon = weapon;
			
			
	 }
	 
	 public Inventory(Weapon weapon, Consumible consumible ) 
	 {
		 this(weapon);
		 
		 consumibles.add(consumible);
	 }
	 
	 public void addConsum(Consumible consum) {
		 consumibles.add(consum);
	 }
	 
	 public void delConsum(Consumible consum) {
		 
		 consumibles.remove(consum);
	 }
	 public void addArmour(Armour armadura) {
		 
		 if(this.armour.contains(armadura)) {
			 
			 System.out.println("Ya tienes un/a"+ armadura);
			 return;
		 }else {
			 
			 this.armour.addLast(armadura);
			 //System.out.println("Has añadido" + armadura + " a tu armadura");
		 }
	 }
	 
	 public int getDefPoints() {
		 
		 int defpoints = 0;
		 for(int i = 0; i < armour.size(); i++) {
			 
			 defpoints += armour.get(i).getDef();
		 }
		 
		 return defpoints;
	 }
	 
	 //Setters & getters
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
	 
	 public List<Armour> getArmour() {
			return armour;
		}

		 public void setArmour(List<Armour> armour) {
			 this.armour = armour;
		 }

	 
	 @Override
	 
	 public String toString() {
		 
		 return "Tienes este arma: " + getWeapon() + 
				 ", esta armadura" + getArmour() + 
				 ", Y estos consumibles" + getConsumibles();
	 }
	 
	 
}
