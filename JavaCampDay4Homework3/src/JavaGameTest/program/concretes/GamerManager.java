package JavaGameTest.program.concretes;

import JavaGameTest.program.Entities.Gamer;
import JavaGameTest.program.abstracts.IGamerManager;
import JavaGameTest.program.core.Dogrulama;

public class GamerManager implements IGamerManager{

	Dogrulama dogrulama;

	public GamerManager(EdevletCheckService edevletCheckService) {
		this.dogrulama = edevletCheckService;
	}
	
	
	@Override
	public void kayitOl(Gamer gamer) {
		if(dogrulama.dogrula(gamer)) {
			System.out.println("Oyuncu kayýt edildi : " + gamer.getAd() + " " + gamer.getSoyad());
		}
		
	}

	@Override
	public void kayitGuncelle(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getAd() + " " + gamer.getSoyad());
	}

	@Override
	public void kayitSil(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getAd() + " " + gamer.getSoyad());
	}

	@Override
	public Gamer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}