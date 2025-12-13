package _MedievalZone;

public class Inventory {

	 private Weapon weapon;
	 private Armadura armor;
	 private Consumible[] consumibles;
	 
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
	 public Consumible[] getConsumibles() {
		 return consumibles;
	 }
	 public void setConsumibles(Consumible[] consumibles) {
		 this.consumibles = consumibles;
	 }
	 
	 
}
