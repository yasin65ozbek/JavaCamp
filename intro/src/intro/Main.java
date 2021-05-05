package intro;

public class Main {
	//camelCase ilk kelimelerin ilk harfleri b�y�k yaz�lmas� demek
	//inteligente tab tu�una bas�nca tamamlar veya bi k�sm� yaz�nca sa�da ��kan k���k kelime tamamlayan kutuya denir
	//Don't repeat yourself - Kendini Tekrar Etme
	//CTRL + Space inteligente paneline a�ar yard�m i�in
	
	
	public static void main(String[] args) {
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.10;
		int vade = 26;
		boolean durum = false;
		
		System.out.println(internetSubeButonu);

		if(dolarBugun < dolarDun) {
			System.out.println("Dolar D��t� Resmi");
		}else if(dolarBugun > dolarDun){
			System.out.println("Dolar Y�kseldi Resmi");
		}else {
			System.out.println("Dolar E�it Resmi");
		}

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "�ift�i Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = 
			{
					"H�zl� Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"�ift�i Kredisi",
					"MSB Kredisi",
					"MEB Kredisi"
			};
		//foreach
		for(String kredi : krediler) { //bir dizi var o dizideki elemanlar� hepsini tek tek dola� demek
			System.out.println(kredi);
		}
			System.out.println("--------------------");
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		//soru 1    De�er Tipler
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		//cevap 20
		
		//soru 2    Referans Tipler
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		//cevap 100
		
		//soru 3    De�er Tipler Stringlere �zel bir durumdur referans tip olarak �al��maz
		String sehir1 = "Ankara";
		String sehir2 = "�stanbul";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
		//cevap �stanbul
		
		
		
		
	}

}