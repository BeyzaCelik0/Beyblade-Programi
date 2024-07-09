import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Polymorphism kullanarak beyblade programı

		System.out.println("Beyblade Programına Hoşgeldiniz...");
		System.out.println("************************************");
		System.out.println("Çıkış İçin q'ya Basınız...");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Hangi Beyblade Türünü Üretmek İstiyorsunuz ?");
			System.out.println("************************************");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				
				System.out.println("Programdan Çıkılıyor...");
				break;
			}
			else {
				
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				Beyblade beyblade = fabrika.beybladeUret(islem);
			
			if(beyblade == null) {
				
				System.out.println("Lütfen Geçerli Bir Beyblade İsmi Giriniz");
			 }
			
			else {
				beyblade.bilgileriGoster();
				beyblade.saldir();
				beyblade.kutsalCanavarOrtayaCikar();
			  }
			}
			
		}
	}

}
