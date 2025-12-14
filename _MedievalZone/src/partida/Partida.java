package partida;
import java.util.Random;
import java.util.Scanner;

import characters.*;


public class Partida {

	private int turn = 0;
	private int enemyCount = 0;
	private String location;
	private String[] locations = {
			
		"Parque placentero",
		"Montañas estrepitosas",
		"Socabon Soterrado",
		"Masilla explosiva",
		"Republica Dominicana",
		"Baños turcos",
		"villorrio tailandes",
		"Ayuntamiento 12",
		"Cuenca, la villa del Mega Caballero", //test
		"Extremadura",
		"Poblado foráneo"
			
	};
	
	Scanner sc;
	Enemy[] e;
	Enemy[] p;
	int numJug;
	int decision;
	
	private String[] availableLocations;
	
	public Partida() {
		
		e = new Enemy[20];
	
		for(int i = 0; i < e.length; i++) {
		
		e[i] = enemyGenerator();
		
		}
	}
	
	
	
	
	void Start(){
		sc = new Scanner(System.in);
		e = new Enemy[16];
		System.out.println("Bienvenido");
		System.out.println("Numero de jugadores (max 4)");
		numJug = sc.nextInt();
		p = new Enemy[numJug];
		
		turn  = 0;
		decision = 0;
		
		if(numJug > 4) 
		{
			System.out.println("Max jugadores permitidos son 4");
			System.out.println("Poniendo la cantidad de jugadores a 4");
			numJug = 4;
		}
			
		//Seleccion de personajes
			for(int i = 0; i < numJug; i++) 
			{
				
				System.out.println("Jugador "+ (i+1)+ " elige tipo de personaje:");
				System.out.println("1-. Clerigo");
				System.out.println("2-. Ladron");
				System.out.println("3-. Caballero");
				System.out.println("4-. Fortachon");
				System.out.println("5-. Scout");
				
				//Este personaje lo destruiremos despues, es solo de testing temporal
				System.out.println("6-. pruebaEnemy");
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
					
					case 6:
						p[i] = new enemigoBaibi();
						break;
					default:
						System.out.println("Error en generacion de personaje");
						System.out.println("Seleccione uno nuevo");
						i--;
				}
			}
		
		// Seleccionar un spawnpoint
			System.out.println("");
		
		
	}
	
	public Enemy enemyGenerator() { //Esto necesitara generar stats pero alguien tiene que hacerlas antes
		
			Random random = new Random();
			int choice = random.nextInt(5);
		
		switch (choice) {
		
			case 0: 
				return new Caballero();
			case 1: 
				return new Clerigo();
			case 2:
				return new Fortachon();
			case 3: 
				return new Ladron();
			case 4: 
				return new Scout();
			default:
				return new Caballero();
		}
		
		
		
	}
	
	void CreateParty() {
	
		
		
	}
	
	
	private void Storm() {
		
	}
	
	public void volcarPartida() {
		
		
	}
	
}	

