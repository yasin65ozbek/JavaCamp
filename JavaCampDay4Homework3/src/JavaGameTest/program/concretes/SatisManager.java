package JavaGameTest.program.concretes;

import JavaGameTest.program.Entities.Game;
import JavaGameTest.program.Entities.Gamer;
import JavaGameTest.program.abstracts.ISatisManager;

public class SatisManager implements ISatisManager{

	@Override
	public void satis(Gamer gamer, Game oyunAdi) {
		System.out.println(gamer.getAd() + " " + gamer.getSoyad() + " -> '" + oyunAdi.getOyunAdi() + "' oyununu satın aldı.");
	}


}
