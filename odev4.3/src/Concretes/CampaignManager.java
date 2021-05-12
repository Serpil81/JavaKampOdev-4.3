package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class CampaignManager implements CampaignService {

	public CampaignManager(Player serpil, Game sims, Campaign kapatýyoruz, CampaignManager kampanyaYönetimi) {
		// TODO Auto-generated constructor stub
	}

	public CampaignManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addnewCapaign(Campaign campaign) {
		System.out.println("%15 Ýndirimli yeni kampanya giriþi yapýlmýþtýr. Açýklama: " + campaign.getCampaignName()
				+ " " + campaign.getDiscount());

	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println("Ýndirimli kampanya hakkýnýz kaldýrýlmýþtýr. Detay :" + campaign.getCampaignName() + " % "
				+ campaign.getDiscount());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(
				"Kmpanyanýz Güncellenmiþtir. Yeni Kampanyanýz: Yüzyýlýn Kampanyasý, % 25 indirimli ve artýk sizin için tanýmlý!");
	}

}
