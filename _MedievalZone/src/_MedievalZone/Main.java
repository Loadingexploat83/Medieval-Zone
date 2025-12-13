package _MedievalZone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//E SIGNIFICA ENEMY, P SIGNIFICA PLAYER;
		Scanner sc = new Scanner(System.in);
		Enemy[] e = new Enemy[16];
		System.out.println("Bienvenido");
		System.out.println("Numero de jugadores (max 4)");
		int numJug = sc.nextInt();
		Enemy[] p = new Enemy[numJug];
		
		int turn  = 0;
		int decision = 0;
		
		if(numJug <= 4) {
		
			for(int i = 0; i < numJug; i++) {
				
				System.out.println("Jugador "+ (i+1)+ " elige tipo de personaje:");
				System.out.println("1-. Clerigo");
				System.out.println("2-. Ladron");
				System.out.println("3-. Caballero");
				System.out.println("4-. Fortachon");
				System.out.println("5-. Scout");
				int tipo = sc.nextInt();
				
				switch (tipo){
					
					case 1:
						p[i] = new Clerigo();
						break;
					case 2:
						p[i] = new Ladron();
						break;
					case 3:
						p[i] = new Caballero();
						break;
					case 4:
						p[i] = new Fortachon();
						break;
					case 5:
						p[i] = new Scout();
						break;
				}
			}
			e[0] = new Enemy();
		}
		while(p[0].getHp() != 0 && turn <= 3) { 
			
			System.out.println("Tu turno:");
			System.out.println("1-. Investigar");
			System.out.println("2-. Atacar");
			System.out.println("3-. Inventario");
			decision = sc.nextInt();
			switch (decision){
			
				case 1:
					p[0].getInventario().setWeapon(new Axe());
					p[0].getInventario().setArmor(new Helmet());
					break;
				case 2:
					p[0].Attack(p[0].getInventario().getWeapon(), e[0]);
					System.out.println(e[0].getHp());
					break;
				case 3: 
					
					p[0].getInventario().toString();
					break;
			}
			turn ++;
		}
	}

}
