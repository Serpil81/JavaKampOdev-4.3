package Entities;

public class Campaign {

	private int discount;
	private String campaignName;

	public Campaign() {

	}

	public Campaign(int discount, String campaignName) {
		super();
		this.setDiscount(discount);
		this.campaignName = campaignName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}