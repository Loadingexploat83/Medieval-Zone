package partida;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Weapons.*;
import characters.*;
import consumibles.*;
import Armor.*;


public class Partida {

	private int selection;
	private int enemyCount = 0;
	private String location;
	private List<String> availableLocations = new ArrayList<>();
	
	Scanner sc;
	Enemy[] enemy;
	Enemy[] playerParty;
	int numJug;
	int decision;
	

	//Turno actual
	private int turnCount = 0;
	
	//En que turno aparece la tormenta
	private int stormComing = 5;
	
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
		
		try {
		numJug = sc.nextInt();
		} catch (Exception e) 
		{
			System.out.println("Entrada Invalida, se asignara 1 jugador");
			sc.nextLine();
			numJug = 1;
		}
		
		turnCount  = 0;
		decision = 0;
		
		if(numJug > 4) 
		{
			System.out.println("Max jugadores permitidos son 4");
			System.out.println("Poniendo la cantidad de jugadores a 4");
			numJug = 4;
		}
		
		playerParty = new Enemy[numJug];
		
		// Eliges los personajes de tu party
		createParty();
		
		// Seleccionar un spawnpoint
		moverte();
		
		
		while(playerParty[0].getHp()>=0) {
			
			select();
		}
		
		System.out.println("Has muerto");
		
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
	
	// Devuelve la opcion que elija el usuario
	// Solo sale cuando opcion es >=min y <= al max
	private int leerOpcion(int min, int max) {
		int opcion;
		while (true) {
			try {
				opcion = sc.nextInt();
				if (opcion >= min && opcion <= max)
					return opcion;
				
				System.out.println("Opcion no valida elige del " + min + " al " + max);
			} catch (Exception e) {
				System.out.println("Entrada no valida, introduce un numero");
				sc.nextLine();
			}
		}
	}

	//Seleccion de personajes
	void createParty() {
	
		for(int i = 0; i < numJug; i++)
		{
			
			System.out.println("Jugador "+ (i+1)+ " elige tipo de personaje:");
			System.out.println("1-. Clerigo");
			System.out.println("2-. Ladron");
			System.out.println("3-. Caballero");
			System.out.println("4-. Fortachon");
			System.out.println("5-. Scout");
			
			//Este personaje lo destruiremos despues, es solo de testing temporal
			System.out.println("6-. Prueba Personaje");
			
			
			int tipo = leerOpcion(1, 6);
			
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
			}
			
			playerParty[i].setName((i+1) + ". " + playerParty[i].getClass().getSimpleName());
		}
	

	}
	
	
	void select() 
	{
		//Si llevas mas de los turnos que quedan de tormenta en una zona, muere toda tu party
		if ((stormComing - turnCount) < 0) {
			System.out.println("La tormenta te alcanzo... ");
			
			for(int i = 0; i < playerParty.length; i++) {
				playerParty[i].setHp(0);
			}
			return;
		}
		
		System.out.println("Te quedan " + (5-turnCount) + " turnos en " + location);
		System.out.println("\nSelecciona tu siguiente accion...");
		System.out.println("1. Cambiar de zona");
		System.out.println("2. Descansar");
		System.out.println("3. Explorar");
		System.out.println("4. Abrir Inventario");
		System.out.println("5. Mirar Stats");
				
			
		selection = leerOpcion(1, 5);
			
		
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
			
			//Abrir el inventario y checkStats no usan un turno;
			case 4:
				abrirInventario();
				turnCount--;
				break;
			
			case 5:
				checkStats();
				turnCount--;
				break;
		
		
		}
		
		turnCount++;
	}
	
	void explore() {
		//En explore 
		Random random = new Random();
		
		//Esto es un numero del 0 al 1
		int roll = random.nextInt(2);
		System.out.println("Exploras la zona... ");
		if (roll == 1) {
			//iniciarCombate();
		}
		
		else {
			encontrarLoot();
		}
		
	}
	
	void encontrarLoot () {
		
	}
	
	void abrirInventario() 
	{
		System.out.println("En tu inventario tienes:");
		for (int i = 0; i < playerParty.length; i++) {
			System.out.println(playerParty[i].getName() + " tiene:");
			System.out.println(playerParty[i].getInventario().toString());
		}
		
	}
	
	void moverte() {
		
		//Printeamos todos los sitios a los que puedes ir
		System.out.println("\nLocalizaciones Disponibles: ");	
		for(int i = 0; i < availableLocations.size(); i++) 
		{
			System.out.println((i+1) + ". "+ availableLocations.get(i));
			
		}
		
		int selection = leerOpcion(1, availableLocations.size());
		
		location = availableLocations.get(selection-1);
		
		availableLocations.remove(selection-1);
		
		System.out.println("\nEstas en: " + location + "\n");
	}
	
	void descansar() {
		//Este es un numero random del 10 al 40 el cual cura a cada miembro de la party por ese valor
		int randomNum = (int) (Math.random()*30 + 10);
		int curaTotal = 0;
		
		for (int i = 0; i < playerParty.length; i++) {
			curaTotal += playerParty[i].healHP(randomNum);
		}
		
		System.out.println("Descansas... Tu party se a curado para un total de: " + curaTotal + " hp");
		
	}
	

	
	
	
	void checkStats() 
	{
		System.out.println("Tu party consiste de:");
		for (int i = 0; i < playerParty.length; i++) {
			System.out.println(playerParty[i].getName() + " con: ");
			System.out.println(playerParty[i].getDmg() + " de DMG, "  +
								playerParty[i].getHp() + " de vida y " + 
								playerParty[i].getDef() + " de Def");
		}
	}
	
	private Consumible randomConsumible() {
		Random random = new Random();
		
		//el random.nextInt(x) debe tener en X la cantidad de consumible que tengamos
		int roll = random.nextInt(1);
		
		//Aqui pondremos la lista con cada consumible
		switch (roll) {
		case 0:
			return new PociondeVida();
		
		default:
			return null;
		}
	}
	
	
	// TODO: completar randomWeapon y randomArmour
	private Weapon randomWeapon() {
		Random random = new Random();
		int roll = random.nextInt(7);
		
		switch (roll) {
		case 0:
			return new Axe();
		
		default:
			return null;
		}
	}

	public void volcarPartida() 
	{
		
		
	}
	

	
	
	
}	

