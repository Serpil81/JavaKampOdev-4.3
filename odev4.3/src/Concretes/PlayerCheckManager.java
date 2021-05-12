package Concretes;

import Abstracts.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		return false;
	}

}
