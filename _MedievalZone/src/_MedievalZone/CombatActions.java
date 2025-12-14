package _MedievalZone;

import Weapons.Weapon;
import characters.Enemy;

public interface CombatActions {

	void Attack(Weapon arma, Enemy e);
	int Guard();
	void UseItem();
}
