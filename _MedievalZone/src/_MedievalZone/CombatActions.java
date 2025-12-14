package _MedievalZone;

import Weapons.Weapon;

public interface CombatActions {

	void Attack(Weapon arma, Enemy e);
	int Guard();
	void UseItem();
}
