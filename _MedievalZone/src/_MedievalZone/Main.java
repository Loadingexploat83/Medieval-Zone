package _MedievalZone;

import java.util.Scanner;

import Armor.Helmet;
import Weapons.Axe;
import characters.Caballero;
import characters.Clerigo;
import characters.Enemy;
import characters.Fortachon;
import characters.Ladron;
import characters.Scout;
import partida.Partida;

public class Main {

	public static void main(String[] args) 
	{
		
		Partida partida = new Partida();
		
		partida.start();
		
		// TODO Auto-generated method stub
		
		//E SIGNIFICA ENEMY, P SIGNIFICA PLAYER;
		
			//e[0] = new Enemy();
		
		
		
		/*
		while(p[0].getHp() != 0 && turn <= 3) 
		{ 
			
			System.out.println("Tu turno:");
			System.out.println("1-. Investigar");
			System.out.println("2-. Atacar");
			System.out.println("3-. Inventario");
			decision = sc.nextInt();
			switch (decision)
			{
				case 1:
					p[0].getInventario().setWeapon(new Axe());
					p[0].getInventario().setArmor(new Helmet());
					break;
					
				case 2:
					p[0].Attack(p[0].getInventario().getWeapon(), e[0]);
					System.out.println("Tu vida: " + e[0].getHp());
					break;
				case 3: 
					
					p[0].getInventario().toString();
					break;
			}
			
			turn ++;
		}
		*/
		
		
	}
}
