
public class MarketingManager {

	private Player player;

	public MarketingManager(Player player) {
		super();
		this.player = player;
	}

	public void reklamYap(Player player) {
		System.out.println("Reklam yap�ld�." + player.getFirstName());

	}

	public void satisYap(Player player) {
		System.out.println("Sati� yapiliyor" + player.getFirstName());
	}

}
