package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class CampaignManager implements CampaignService {

	public CampaignManager(Player serpil, Game sims, Campaign kapatıyoruz, CampaignManager kampanyaYönetimi) {
		// TODO Auto-generated constructor stub
	}

	public CampaignManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addnewCapaign(Campaign campaign) {
		System.out.println("%15 İndirimli yeni kampanya girişi yapılmıştır. Açıklama: " + campaign.getCampaignName()
				+ " " + campaign.getDiscount());

	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println("İndirimli kampanya hakkınız kaldırılmıştır. Detay :" + campaign.getCampaignName() + " % "
				+ campaign.getDiscount());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(
				"Kmpanyanız Güncellenmiştir. Yeni Kampanyanız: Yüzyılın Kampanyası, % 25 indirimli ve artık sizin için tanımlı!");
	}

}
