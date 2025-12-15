package Weapons;

import java.util.Scanner;

public class Sword extends Weapon {
	
	private static int mult = 5;
	private static int baseDmg = 10;
	private static int baseWeight = 20;
	private int percentage = 10;
	Scanner sc = new Scanner(System.in);
	
	public Sword() {
		super(baseDmg,baseWeight);
	}
	
	public Sword(int mod) {
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
	}
	
	public int behead() {
		if(Math.random()*100< percentage) {
			System.out.println("You have beheaded the Enemy");
			return getDmg()*1000;
		}else {
			System.out.println("The Enemy dodge the Attack");
			return 0;
		}
	}
	
	public int useWeapon() {
		int x = 0;
		System.out.println("Type of attack:");
		System.out.println("1. Normal");
		System.out.println("2. Beheading");
		System.out.print("Answer: ");
		try {
			x = sc.nextInt();
			} catch (Exception e) 
			{
				System.out.println("Entrada Invalida, se asignara Attack basico (1. Normal)");
				sc.nextLine();
				x = 1;
			}
		if(x == 1) return getDmg();
		else return behead();
			
		
	}

}
