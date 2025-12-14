package partida;
import java.util.Random;
import characters.Caballero;
import characters.Clerigo;
import characters.Fortachon;
import characters.Ladron;
import characters.Scout;
import _MedievalZone.Enemy;


public class Partida {

	private int turn = 0;
	private int enemyCount = 0;
	private String location;
	private String[] locations;
	private String[] availableLocations;
	
	public Partida() {
		
		Enemy[] enemies = new Enemy[20];
	
		for(int i = 0; i < enemies.length; i++) {
		
		enemies[i] = enemyGenerator();
		
		}
	}
	
	public static Enemy enemyGenerator() { //Esto necesitara generar stats pero alguien tiene que hacerlas antes
		
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
	//Enemy[] enemies = new enemy[3]; no se como vais a hacer lo de enemies
	
	
	
	void Start(){
		
		
		
	}
	
	void CreateParty() {
	
	}
	
	void CrearEnemigos() {
		
	}
	
	private void Storm() {
		
	}
	
	public void volcarPartida() {
		
		
	}
	
}	

