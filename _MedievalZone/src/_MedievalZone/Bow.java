package _MedievalZone;

public class Bow extends Weapon {

	private static int mult = 15;
	private int arrows;
	private static int baseDmg = 35;
	private static int baseWeight = 20;
	
	//base Bow
	public Bow(){
		super(baseDmg,baseWeight);
		this.setArrows(5);
	}
	//solo modifica daño y peso
	public Bow(int mod){
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
		this.setArrows(5);
	}
	//lo mismo que el anterior pero especifica el numero de flechas
	public Bow(int mod, int numArrows){
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
		this.setArrows(numArrows);
	}
	
	//devuelve la cantidad de flechas
	public int getArrows() {
		return arrows;
	}
	//to set the arrows with construct
	private void setArrows(int arrows) {
		this.arrows = arrows;
	}
	
	//solo añade una flecha
	public void addArrows() {
		this.arrows++;
	}
	//añade tantas flechas como especificado
	public void addArrows(int num) {
		this.arrows += num;
	}

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
