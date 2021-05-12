package Abstracts;

import Entities.Player;

public interface PlayerService {

	void signIn(Player player);

	void signUp(Player player);

	void editProfile(Player player);

	void deleteProfile(Player player);

}
