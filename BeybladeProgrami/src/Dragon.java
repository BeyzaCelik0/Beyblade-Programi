
public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliYetenek;
	
	public Dragon(String beybladeOyuncusu, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeOyuncusu, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek= gizliYetenek;
	}
	
	@Override
	public void kutsalCanavarOrtayaCikar() {
		super.kutsalCanavarOrtayaCikar();
		
		System.out.println("Kutsal Canavar Adı:" + kutsalCanavar);
		System.out.println("Gizli Yetenek:" + gizliYetenek);
	}

	@Override
	public void bilgileriGoster() {
		
		System.out.println(getBeybladeOyuncusu() + " " + kutsalCanavar + "'sınıı ortaya çıkarıyor.");
		
		System.out.println(getBeybladeOyuncusu() + "'nun Saldırısı : Hayalet Kasırgası" );
	}
}
