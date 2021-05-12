package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class CampaignManager implements CampaignService {

	public CampaignManager(Player serpil, Game sims, Campaign kapat�yoruz, CampaignManager kampanyaY�netimi) {
		// TODO Auto-generated constructor stub
	}

	public CampaignManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addnewCapaign(Campaign campaign) {
		System.out.println("%15 �ndirimli yeni kampanya giri�i yap�lm��t�r. A��klama: " + campaign.getCampaignName()
				+ " " + campaign.getDiscount());

	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println("�ndirimli kampanya hakk�n�z kald�r�lm��t�r. Detay :" + campaign.getCampaignName() + " % "
				+ campaign.getDiscount());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(
				"Kmpanyan�z G�ncellenmi�tir. Yeni Kampanyan�z: Y�zy�l�n Kampanyas�, % 25 indirimli ve art�k sizin i�in tan�ml�!");
	}

}
