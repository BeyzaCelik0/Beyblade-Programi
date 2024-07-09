
public class Draciel extends Beyblade{
	
	 private String kutsalCanavar;
	 	
	 public Draciel(String beybladeOyuncusu, int donusHizi, int saldiriGucu, String kutsalCanavar) {
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
			
			System.out.println(getBeybladeOyuncusu() + " " + kutsalCanavar + "'yı ortaya çıkarıyor.");
			
			System.out.println(getBeybladeOyuncusu() + "'ın Savunması : Kale Savunması" );
		}

}
