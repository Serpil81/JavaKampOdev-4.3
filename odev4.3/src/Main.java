import java.util.GregorianCalendar;

import Adapter.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameSellingManager;
import Concretes.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {

		Player Serpil = new Player();
		Serpil.setFirstName("Serpil");
		Serpil.setLastName("TURAN Y�KSEL");
		Serpil.setNationalityId("4352342");
		Serpil.setDateOfBirth(new GregorianCalendar(1989, 10, 10).getTime());

		Player Ahmet = new Player();
		Ahmet.setFirstName("Ahmet");
		Ahmet.setLastName("Y�ksel");
		Ahmet.setNationalityId("12435453542");
		Ahmet.setDateOfBirth(new GregorianCalendar(1979, 07, 15).getTime());

		Game Sims = new Game();
		Sims.setIdOfTheGame(1);
		Sims.setNameOfTheGame("Sims Comansa Na Na");
		Sims.setPrice(1000000);

		Game SimCity = new Game();
		SimCity.setIdOfTheGame(2);
		SimCity.setNameOfTheGame("SimCity");
		SimCity.setPrice(150000000);

		Campaign kampanya1 = new Campaign();
		kampanya1.setCampaignName("'D�nemsel KAPATIYORUUUZ' ");
		kampanya1.setDiscount(50);

		Campaign kampanya2 = new Campaign();
		kampanya2.setCampaignName("Yeni Y�l Kmapanyas�");
		kampanya2.setDiscount(20);

		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.signUp(Ahmet);
		playerManager.signIn(Ahmet);
		playerManager.editProfile(Ahmet);
		playerManager.deleteProfile(Ahmet);

		CampaignManager kampanyaY�netimi = new CampaignManager();
		kampanyaY�netimi.addnewCapaign(kampanya1);
		kampanyaY�netimi.updateCampaign(kampanya1);
		kampanyaY�netimi.removeCampaign(kampanya1);

		CampaignManager kampanyaY�netimi2 = new CampaignManager();
		kampanyaY�netimi.addnewCapaign(kampanya2);
		kampanyaY�netimi.updateCampaign(kampanya2);
		kampanyaY�netimi.removeCampaign(kampanya2);

		GameSellingManager gameSellingManager = new GameSellingManager(new CampaignManager());
		gameSellingManager.sellGameWithCampaign(Serpil, Sims, kampanya1, kampanyaY�netimi);
		gameSellingManager.sellGameWithCampaign(Ahmet, SimCity, kampanya2, kampanyaY�netimi2);

	}
}