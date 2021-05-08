
public class NewMemberManager {

	/*
	 * Bir oyun yazmak istiyorsunuz. Bu yazýlým için backend kodlarýný JAVA ile
	 * geliþtirmeyi planlýyoruz. Yeni üye, satýþ ve kampanya yönetimi yapýlmasý
	 * isteniyor. Nesnelere ait özellikleri istediðiniz gibi verebilirsiniz. Burada
	 * amaç yazdýðýnýz kodun kalitesidir. Ödevde gereksinimleri tam anlamadýðýnýz
	 * durum benim için önemli deðil, kendinize göre mantýk geliþtirebilirsiniz.
	 * Dediðim gibi kod kalitesiyle ilgileniyoruz þu an :)
	 * 
	 * 
	 * 
	 * Gereksinimler
	 * 
	 * 1. Oyuncularýn sisteme kayýt olabileceði, bilgilerini güncelleyebileceði,
	 * kayýtlarýný silebileceði bir ortamý simule ediniz. Müþteri bilgilerinin
	 * doðruluðunu e-devlet sistemlerini kullanarak doðrulama yapmak istiyoruz.
	 * (E-devlet sistemlerinde doðrulama TcNo, Ad, Soyad, DoðumYýlý bilgileriyle
	 * yapýlýr. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)
	 * 
	 * 2. Oyun satýþý yapýlabilecek satýþ ortamýný simule ediniz. ( Yapýlan satýþlar
	 * oyuncu ile iliþkilendirilmelidir. Oyuncunun parametre olarak metotta olmasýný
	 * kastediyorum.)
	 * 
	 * 3. Sisteme yeni kampanya giriþi, kampanyanýn silinmesi ve güncellenmesi
	 * imkanlarýný simule ediniz.
	 * 
	 * 4. Satýþlarda kampanya entegrasyonunu simule ediniz.
	 * 
	 * 
	 */
	private Player player;

	public NewMemberManager() {
	}

	public NewMemberManager(Player player) {
		super();
		this.player = player;
	}

	void signIn(Player player) {
		System.out.println("Giriþ Baþarýlý" + player.getFirstName());
	}

	void signUp(Player player) {
		System.out.println("Kayýt Oldunuz" + player.getFirstName());
	}

	void updateProfile(Player player) {
		System.out.println("Kaydýnýz Güncellendi" + player.getFirstName());
	}

}
