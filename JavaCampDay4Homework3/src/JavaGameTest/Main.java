package JavaGameTest;

import JavaGameTest.program.Entities.Game;
import JavaGameTest.program.Entities.Gamer;
import JavaGameTest.program.Entities.Kampanya;
import JavaGameTest.program.concretes.EdevletCheckService;
import JavaGameTest.program.concretes.GamerManager;
import JavaGameTest.program.concretes.KampanyaManager;
import JavaGameTest.program.concretes.SatisManager;

public class Main {

	public static void main(String[] args) {
		
		Game oyun1 = new Game(1,"GTA V",69);
		Game oyun2 = new Game(1,"Call Of Duty MW",40);
		

		GamerManager gamerManager = new GamerManager(new EdevletCheckService());
		//Oyuncular
		Gamer gamer1 = new Gamer(1,"Yasin","ÖZBEK",1546578424,"2001");
		Gamer gamer2 = new Gamer(2,"Ayþe","SÖNMEZ",15474461,"1997");
		Gamer gamer3 = new Gamer(3,"Engin","Demirog",548668412,"1994");
		//!Oyuncýlar
		

		Kampanya kampanya1 = new Kampanya(1, "Ramazan", 50);
		

		System.out.println("--------------Kaydolma - Güncelleme - Silme--------------\n");
			gamerManager.kayitOl(gamer1);
			System.out.println("--------------");
			gamerManager.kayitOl(gamer2);
			gamerManager.kayitGuncelle(gamer2);
			System.out.println("--------------");
			gamerManager.kayitOl(gamer3);
			gamerManager.kayitSil(gamer3);
		System.out.println("\n--------------!Kaydolma - Güncelleme - Silme--------------");
		

		System.out.println("\n\n--------------Satýn Alma--------------\n");
		SatisManager satisManager = new SatisManager();
		satisManager.satis(gamer1, oyun2);
		System.out.println("--------------");
		satisManager.satis(gamer2, oyun1);
		System.out.println("\n--------------!Satýn Alma--------------");
		
		

		System.out.println("\n\n--------------Ýndirim--------------\n");
		KampanyaManager kampanyaManager = new KampanyaManager();
		kampanyaManager.kampanya(oyun2, kampanya1);
		System.out.println("--------------");
		kampanyaManager.kampanya(oyun1, kampanya1);
		System.out.println("\n--------------!Ýndirim--------------");
		

	
	}

}
