package Concretes;

import Abstracts.PlayerCheckService;
import Abstracts.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	private PlayerCheckService _playerCheckService;

	public PlayerManager(PlayerCheckService _playerCheckService) {
		super();
		this._playerCheckService = _playerCheckService;
	}

	@Override
	public void signIn(Player player) {
		System.out.println("Giri� Ba�ar�l�: " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void signUp(Player player) {
		System.out
				.println("Kayd�n�z Ba�ar� ile olu�turulmu�tur: " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void editProfile(Player player) {
		System.out.println("Profiliniz d�zenlenmi�tir :" + player.getFirstName() + " " + player.getLastName());
	}

	@Override
	public void deleteProfile(Player player) {
		System.out.println("Profiliniz silinmi�tir :" + player.getFirstName() + " " + player.getLastName());

	}

}
