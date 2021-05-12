package Abstracts;

import Concretes.CampaignManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface GameSellingService {

	void sellGame(Player player, Game game);

	void sellGameWithCampaign(Player player, Game game, Campaign campaign, CampaignManager _campaignManager);
}
