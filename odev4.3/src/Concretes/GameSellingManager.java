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
				game.getNameOfTheGame() + " oyun satýþý " + player.getFirstName() + " isimli oyuncuya yapýlmýþtýr. ");

	}

	@Override
	public void sellGameWithCampaign(Player player, Game game, Campaign campaign, CampaignManager _campaignManager) {
		System.out.println("'" + game.getNameOfTheGame() + "'" + " Kampanyalý oyun satýþý bilgileri: Oyun "
				+ player.getFirstName() + " isimli oyuncuya " + campaign.getCampaignName()
				+ " kampanyasý uygulanarak, % " + campaign.getDiscount() + " indirim oranýyla satýlmýþtýr. ");

	}

}
