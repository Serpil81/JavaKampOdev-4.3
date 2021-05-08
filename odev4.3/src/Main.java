import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		Player Engin = new Player();
		Engin.setFirstName("Engin");
		Engin.setLastName("Demiroð");
		Engin.setNationalityId("1234567");
		Engin.setDateOfBirth(new GregorianCalendar(1993, 11, 16).getTime());

		MarketingManager marketingManager = new MarketingManager(Engin);
		marketingManager.reklamYap(Engin);
		marketingManager.satisYap(Engin);
	}

}
