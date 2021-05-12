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
		System.out.println("%" + campaign.getDiscount() + " Ýndirimli yeni kampanya giriþi yapýlmýþtýr. Açýklama: "
				+ campaign.getCampaignName());

	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println("Ýndirimli kampanya hakkýnýz kaldýrýlmýþtýr. Detay :" + campaign.getCampaignName());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kmpanyanýz Güncellenmiþtir. Yeni Kampanyanýz: Yüzyýlýn Kampanyasý," + "% "
				+ campaign.getDiscount() + "indirimli ve artýk sizin için tanýmlý!");
	}

}
