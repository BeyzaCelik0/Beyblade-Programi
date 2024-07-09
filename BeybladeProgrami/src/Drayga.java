
public class Drayga extends Beyblade{

    private String kutsalCanavar;
	
	public Drayga(String beybladeOyuncusu, int donusHizi, int saldiriGucu, String kutsalCanavar) {
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
		
		System.out.println(getBeybladeOyuncusu() + " " + kutsalCanavar + "'nı ortaya çıkarıyor.");
		
		System.out.println(getBeybladeOyuncusu() + "'nin Saldırısı : Kaplan Pençesi" );
	}
}
