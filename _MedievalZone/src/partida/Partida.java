package partida;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import characters.*;


public class Partida {

	private int selection;
	private int turnCount = 0;
	private int enemyCount = 0;
	private String location;
	private List<String> availableLocations = List.of( 
			
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
			
	);
	
	Scanner sc;
	Enemy[] enemy;
	Enemy[] playerParty;
	int numJug;
	int decision;
	
	public Partida() {
		
		enemy = new Enemy[20];
	
		for(int i = 0; i < enemy.length; i++) {
		
			enemy[i] = enemyGenerator();
		
		}
	}
	
	
	
	
	public void start(){
		sc = new Scanner(System.in);
		enemy = new Enemy[16];
		System.out.println("Bienvenido");
		System.out.println("Numero de jugadores (max 4)");
		numJug = sc.nextInt();
		playerParty = new Enemy[numJug];
		
		turnCount  = 0;
		decision = 0;
		
		if(numJug > 4) 
		{
			System.out.println("Max jugadores permitidos son 4");
			System.out.println("Poniendo la cantidad de jugadores a 4");
			numJug = 4;
		}
		
		
		createParty();
		// Seleccionar un spawnpoint
		System.out.println("¿Donde desea empezar su aventura?");
		for (int i = 0; i < availableLocations.size(); i++) 
		{
			System.out.println((i+1)+ ". " + availableLocations.get(i));
		}
		
		
		while(playerParty[0].getHp()>=0) {
			
			select();
		}
		
			
		
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
	
	void createParty() {
	
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
					
					playerParty[i] = new Clerigo();
					break;
				case 2:
					playerParty[i] = new Ladron();
					break;
				case 3:
					playerParty[i] = new Caballero();
					break;
				case 4:
					playerParty[i] = new Fortachon();
					break;
				case 5:
					playerParty[i] = new Scout();
					break;
				
				case 6:
					playerParty[i] = new enemigoBaibi();
					break;
				default:
					System.out.println("Error en generacion de personaje");
					System.out.println("Seleccione uno nuevo");
					i--;
			}
		}
	

	}
	
	
	private void storm() {
		
	}
	
	public void volcarPartida() {
		
		
	}
	

	
	void select() 
	{
		

		int stormComing = 0;
		
		while (stormComing == 0) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Selecciona tu siguiente accion...");
			System.out.println("1. Cambiar de zona, 2. Descansar, 3. Explorar");
			
			int selection = scanner.nextInt();
			
			if(turnCount == 5) 
			{
				
				System.out.println("Tienes que moverte!");
				
			} else 
			{
				
				stormComing = 1;
				
			}
			
		}
		
		switch (selection)
		{
		
			case 1:
				
				moverte();
				
			case 2:
				
				descansar();
				
			case 3:
				
				explore();
		
		
		}
		
	
	}
	
	void moverte() {
		int selection;
		
		do {
			System.out.println("Localizaciones Disponibles: ");
			
			for(int i = 0; i < availableLocations.size(); i++) 
			{
				System.out.println((i+1) + availableLocations.get(i));
			
			}
		
		selection = sc.nextInt();
		if(selection > availableLocations.size()) 
		{
			System.out.println("Error, no se a encontrado la localizacion");
		}
		} while(selection > availableLocations.size());
			
		
		location = availableLocations.get(selection-1);
		
		availableLocations.remove(selection-1);
	}
	
	void descansar() {
		
		
		healParty(Math.random()*30 + 10);
		
		System.out.println("Descansas... Te has curado: " + " hp");
		
	}
	
}	

