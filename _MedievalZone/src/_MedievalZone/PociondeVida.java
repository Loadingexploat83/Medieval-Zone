package _MedievalZone;

public class PociondeVida extends Consumible{

	
	private int hp;
	
	public PociondeVida() {
		
		this.hp = 15;
	}
	
	@Override
	public void Action(Enemy p) {
		
		p.Hit(-hp);
	}
}
