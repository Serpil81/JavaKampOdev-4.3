package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class CampaignManager implements CampaignService {

	public CampaignManager(Player player, Game game, Campaign campaign, CampaignManager _CampaignManager) {
		// TODO Auto-generated constructor stub
	}

	public CampaignManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addnewCapaign(Campaign campaign) {
		System.out.println("%" + campaign.getDiscount() + " �ndirimli yeni kampanya giri�i yap�lm��t�r. A��klama: "
				+ campaign.getCampaignName());

	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println("�ndirimli kampanya hakk�n�z kald�r�lm��t�r. Detay :" + campaign.getCampaignName());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kmpanyan�z G�ncellenmi�tir. Yeni Kampanyan�z: Y�zy�l�n Kampanyas�," + "% "
				+ campaign.getDiscount() + "indirimli ve art�k sizin i�in tan�ml�!");
	}

}
