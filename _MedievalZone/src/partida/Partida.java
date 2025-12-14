package partida;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Armor.*;
import consumibles.*;
import characters.*;


public class Partida {

	private int selection;
	private int turnCount = 0;
	private int enemyCount = 0;
	private String location;
	private List<String> availableLocations = new ArrayList<>();
	
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
		
		fillAvailableLocations();
	}
	
	
	
	private void fillAvailableLocations() {
		availableLocations.add("Parque placentero");
		availableLocations.add("Montañas estrepitosas");
		availableLocations.add("Socabon Soterrado");
		availableLocations.add("Masilla explosiva");
		availableLocations.add("Republica Dominicana");
		availableLocations.add("Baños turcos");
		availableLocations.add("Villorrio tailandés");
		availableLocations.add("Ayuntamiento 12");
		availableLocations.add("Cuenca, la villa del Mega Caballero");
		availableLocations.add("Extremadura");
		availableLocations.add("Poblado foráneo");
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
		
		// Eliges los personajes de tu party
		createParty();
		
		// Seleccionar un spawnpoint
		moverte();
		
		
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
	
	
	public void volcarPartida() {
		
		
	}
	

	
	void select() 
	{
		

		int stormComing = 0;
		
		while (stormComing == 0) 
		{
			sc = new Scanner(System.in);
			System.out.println("Selecciona tu siguiente accion...");
			System.out.println("1. Cambiar de zona \n2. Descansar  \n3. Explorar \n"
					+ "4. Abrir Inventario \n5. Mirar Stats");
			
				
			
			selection = sc.nextInt();
			
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
				break;
				
			case 2:
				
				descansar();
				break;
				
			case 3:
				
				//explore();
				playerParty[0].Hit(40);
				break;
				
			case 4:
				abrirInventario();
				break;
			
			case 5:
				checkStats();
				break;
		
		
		}
		
	
	}
	
	void abrirInventario() 
	{
		
		
	}
	
	void checkStats() 
	{
		
	}
	
	void moverte() {
		
		
		do {
			System.out.println("\nLocalizaciones Disponibles: ");
			
			for(int i = 0; i < availableLocations.size(); i++) 
			{
				System.out.println((i+1) + ". "+ availableLocations.get(i));
			
			}
		
		selection = sc.nextInt();
		if(selection > availableLocations.size()) 
		{
			System.out.println("Error, no se a encontrado la localizacion");
		}
		
		} while(selection > availableLocations.size());
			
		
		location = availableLocations.get(selection-1);
		
		availableLocations.remove(selection-1);
		
		System.out.println("\nEstas en: " + location + "\n");
	}
	
	void descansar() {
		int randomNum = (int) (Math.random()*30 + 10);
		int curaTotal = 0;
		
		for (int i = 0; i < playerParty.length; i++) {
			curaTotal += playerParty[i].healHP(randomNum);
		}
		
		System.out.println("Descansas... Te has curado: " + curaTotal + " hp");
		
	}
	
}	

