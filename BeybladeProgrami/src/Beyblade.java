public class Beyblade {
	
	private String beybladeOyuncusu;
	private int donusHizi;
	private int saldiriGucu;
	
	public Beyblade(String beybladeOyuncusu, int donusHizi, int saldiriGucu) {
		
		this.beybladeOyuncusu = beybladeOyuncusu;
		this.donusHizi = donusHizi;
		this.saldiriGucu = saldiriGucu;
	}

	public String getBeybladeOyuncusu() {
		return beybladeOyuncusu;
	}

	public void setBeybladeOyuncusu(String beybladeOyuncusu) {
		this.beybladeOyuncusu = beybladeOyuncusu;
	}

	public int getDonusHizi() {
		return donusHizi;
	}

	public void setDonusHizi(int donusHizi) {
		this.donusHizi = donusHizi;
	}

	public int getSaldiriGucu() {
		return saldiriGucu;
	}

	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}
	
	public void saldir() {
		
		System.out.println(beybladeOyuncusu + " " + saldiriGucu + " ve " + donusHizi+ " ile saldırıyor.");
	}
	
	public void kutsalCanavarOrtayaCikar() {
		System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor.");
	}
	
	public void bilgileriGoster() {
		System.out.println("Beybilade Oyuncusunun İsmi:" + beybladeOyuncusu);
		System.out.println("Dönüş Hızı:" + donusHizi);
		System.out.println("Saldırı Gücü:" + saldiriGucu);
	}

}