
public class NewMemberManager {

	/*
	 * Bir oyun yazmak istiyorsunuz. Bu yaz�l�m i�in backend kodlar�n� JAVA ile
	 * geli�tirmeyi planl�yoruz. Yeni �ye, sat�� ve kampanya y�netimi yap�lmas�
	 * isteniyor. Nesnelere ait �zellikleri istedi�iniz gibi verebilirsiniz. Burada
	 * ama� yazd���n�z kodun kalitesidir. �devde gereksinimleri tam anlamad���n�z
	 * durum benim i�in �nemli de�il, kendinize g�re mant�k geli�tirebilirsiniz.
	 * Dedi�im gibi kod kalitesiyle ilgileniyoruz �u an :)
	 * 
	 * 
	 * 
	 * Gereksinimler
	 * 
	 * 1. Oyuncular�n sisteme kay�t olabilece�i, bilgilerini g�ncelleyebilece�i,
	 * kay�tlar�n� silebilece�i bir ortam� simule ediniz. M��teri bilgilerinin
	 * do�rulu�unu e-devlet sistemlerini kullanarak do�rulama yapmak istiyoruz.
	 * (E-devlet sistemlerinde do�rulama TcNo, Ad, Soyad, Do�umY�l� bilgileriyle
	 * yap�l�r. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)
	 * 
	 * 2. Oyun sat��� yap�labilecek sat�� ortam�n� simule ediniz. ( Yap�lan sat��lar
	 * oyuncu ile ili�kilendirilmelidir. Oyuncunun parametre olarak metotta olmas�n�
	 * kastediyorum.)
	 * 
	 * 3. Sisteme yeni kampanya giri�i, kampanyan�n silinmesi ve g�ncellenmesi
	 * imkanlar�n� simule ediniz.
	 * 
	 * 4. Sat��larda kampanya entegrasyonunu simule ediniz.
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
		System.out.println("Giri� Ba�ar�l�" + player.getFirstName());
	}

	void signUp(Player player) {
		System.out.println("Kay�t Oldunuz" + player.getFirstName());
	}

	void updateProfile(Player player) {
		System.out.println("Kayd�n�z G�ncellendi" + player.getFirstName());
	}

}
