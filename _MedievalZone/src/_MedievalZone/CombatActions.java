package _MedievalZone;

import Weapons.Weapon;
import characters.Enemy;
import consumibles.Consumible;

public interface CombatActions {

	void Attack(Weapon arma, Enemy e);
	int Guard(int aumento);
	void UseItem(Consumible consum);
}
