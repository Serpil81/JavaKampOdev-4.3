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
		System.out.println("Giriþ Baþarýlý: " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void signUp(Player player) {
		System.out
				.println("Kaydýnýz Baþarý ile oluþturulmuþtur: " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void editProfile(Player player) {
		System.out.println("Profiliniz düzenlenmiþtir :" + player.getFirstName() + " " + player.getLastName());
	}

	@Override
	public void deleteProfile(Player player) {
		System.out.println("Profiliniz silinmiþtir :" + player.getFirstName() + " " + player.getLastName());

	}

}
