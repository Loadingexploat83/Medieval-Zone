package _MedievalZone;

public class Bow extends Weapon {

	private int mult = 15;
	private int arrows;
	
	public Bow(){
		super(35,20);
		this.setArrows(5);
	}
	//solo modifica daño y peso
	public Bow(int mod){
		super(35,20);
		modDmg(mod*mult);
		modWeight(mod*mult);
		this.setArrows(5);
	}
	//lo mismo que el anterior pero especifica el numero de flechas
	public Bow(int mod, int numArrows){
		super(35,20);
		modDmg(mod*mult);
		modWeight(mod*mult);
		this.setArrows(numArrows);
	}
	
	
	public int getArrows() {
		return arrows;
	}
	//to set the arrows with construct
	private void setArrows(int arrows) {
		this.arrows = arrows;
	}
	
	public void addArrows() {
		this.arrows++;
	}
	public void addArrows(int num) {
		this.arrows += num;
	}
	
	//Para hacer daño
	public int useArrow() {
		this.arrows--;
		return getDmg();
	}
	
	@Override
	public String toString() {
		if(arrows>1) {
			return "Bow with Attack of "+ getDmg() +" Weight of "+ getWeight()+" it has " + getArrows() + "Arrows left";
		}else if(arrows==1) {
			return "Bow with Attack of "+ getDmg() +" Weight of "+ getWeight()+" it has " + getArrows() + "Arrow left";
		}else {
			return "Bow with Attack of "+ getDmg() +" Weight of "+ getWeight()+" it has no Arrows left";
		}
	}

}
