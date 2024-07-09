
public class Dranza extends Beyblade{

	private String kutsalCanavar;
	
	public Dranza(String beybladeOyuncusu, int donusHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeOyuncusu, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	@Override
	public void kutsalCanavarOrtayaCikar() {
		super.kutsalCanavarOrtayaCikar();
		
		System.out.println("Kutsal Canavar Adı:" + kutsalCanavar);
	}

	@Override
	public void bilgileriGoster() {
		
		System.out.println(getBeybladeOyuncusu() + " " + kutsalCanavar + "'nu ortaya çıkarıyor.");
		
		System.out.println(getBeybladeOyuncusu() + "'nin Saldırısı : Alev Kılıcı" );
	}

	
}
