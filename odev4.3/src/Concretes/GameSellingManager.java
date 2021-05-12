package Concretes;

import Abstracts.GameSellingService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSellingManager implements GameSellingService {

	private Game game;
	private Player player;
	private Campaign campaign;
	private CampaignManager _campaignManager;

	public GameSellingManager(CampaignManager _campaignManager) {
		super();
		this._campaignManager = _campaignManager;
	}

	@Override
	public void sellGame(Player player, Game game) {
		System.out.println(
				game.getNameOfTheGame() + " oyun sat��� " + player.getFirstName() + " isimli oyuncuya yap�lm��t�r. ");

	}

	@Override
	public void sellGameWithCampaign(Player player, Game game, Campaign campaign, CampaignManager _campaignManager) {
		System.out.println("'" + game.getNameOfTheGame() + "'" + " Kampanyal� oyun sat��� bilgileri: Oyun "
				+ player.getFirstName() + " isimli oyuncuya " + campaign.getCampaignName()
				+ " kampanyas� uygulanarak, % " + campaign.getDiscount() + " indirim oran�yla sat�lm��t�r. ");

	}

}
