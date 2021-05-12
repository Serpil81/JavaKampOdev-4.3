
package Adapter;

import Abstracts.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getDateOfBirth().getYear());
		} catch (Exception e) {
			System.out.println("Üye Bilgileri Hatalý");
		}

		return result;
	}

}