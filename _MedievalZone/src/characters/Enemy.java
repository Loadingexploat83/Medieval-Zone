package characters;

import Armor.Armour;
import Weapons.Weapon;
import _MedievalZone.CombatActions;
import consumibles.Consumible;

public abstract class Enemy implements CombatActions{

	private String type;
	private String name;
	
	private int hp;
	private int maxHp = 100;
	private int def;
	private int dmg;
	private Inventory inventario;
	
    private int bonusDmg = 0;
    private int bonusDmgTurns = 0;

    private int bonusDef = 0;
    private int bonusDefTurns = 0;
	
	public Enemy() {
		this.inventario = new Inventory();
		this.hp = maxHp;
	
	}
	
	public Enemy(Weapon weapon, Armour armadura) {
		this.inventario = new Inventory(weapon, armadura);
		this.hp = maxHp;
	}
		
	public Enemy(Weapon weapon, Armour armadura, Consumible consumible) {
			
			this.inventario = new Inventory(weapon, armadura, consumible);
			this.hp = maxHp;
	}
	
	
	
	public void Hit(int dmg) {
		
		if(dmg <= 0) {
			
			dmg = 1;
		}
		this.hp -= dmg;
	}
	public void aumentarFuerza(int aumento) {
		
		if(getInventario().getWeapon() != null) {
			
			dmg = getInventario().getWeapon().getDmg() + aumento;
			getInventario().getWeapon().setDmg(dmg);
			
		}else {
			
			this.dmg += aumento;
		}
	}
	
	public void aumentarDefensa(int cantidad, int turnos) {
        bonusDef += cantidad;
        bonusDefTurns = Math.max(bonusDefTurns, turnos);
    }
	
	 public void aumentarDanio(int cantidad, int turnos) {
	        bonusDmg += cantidad;
	        bonusDmgTurns = Math.max(bonusDmgTurns, turnos);
	    }
	 
	 public void finTurno() {
	        if (bonusDmgTurns > 0) {
	            bonusDmgTurns--;
	            if (bonusDmgTurns == 0) bonusDmg = 0;
	        }
	        if (bonusDefTurns > 0) {
	            bonusDefTurns--;
	            if (bonusDefTurns == 0) bonusDef = 0;
	        }
	 }
	
	 private int getDefTotal() {
	        int base = this.def;
	        if (inventario != null && inventario.getArmour() != null) {
	            base += inventario.getArmour().getDef();
	        }
	        return base + bonusDef;
	    }
	
	
	@Override
	public void Attack(Weapon arma, Enemy e) {
		
		dmg = arma.useWeapon() - e.getInventario().getDefPoints();
		e.Hit(dmg);
	}
	public int Guard(int aumento) {
		
		if(getInventario().getArmour() != null) {
			def = ((Armour) getInventario().getArmour()).getDef() + aumento;
			((Armour) getInventario().getArmour()).setDef(def);
			System.out.println("Tu defensa ha aumentado");
		}else {
			
			this.def += aumento;
		}
		
		return def;
	}
	public void UseItem(Consumible consum) {
		
		consum.usar(this);
		getInventario().delConsum(consum);
	}
	
	
	public int healHP(int heal) 
	{
		int healthOld = this.hp;
		int actualHeal;
		this.hp += heal;
		this.hp = Math.clamp(hp, 0, maxHp);
		
		
		actualHeal = this.hp - healthOld;
		
		System.out.println(name + " se a curado " + actualHeal);
		return actualHeal;
	}
	
	
	//Setters & getters
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getDef() {
		return def + bonusDef;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getDmg() {
		return dmg + bonusDmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	
	public Inventory getInventario() {
		return inventario;
	}
	public void setInventario(Inventory inventario) {
		this.inventario = inventario;
	}
}	
	
