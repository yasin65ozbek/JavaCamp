package JavaGameTest.program.concretes;

import JavaGameTest.program.Entities.Game;
import JavaGameTest.program.Entities.Kampanya;
import JavaGameTest.program.abstracts.IKampanya;

public class KampanyaManager implements IKampanya{

	@Override
	public void kampanya(Game oyunId, Kampanya kampanyaId) {
		System.out.println(oyunId.getOyunAdi() + " Oyununa "+ kampanyaId.getKampanyaAdi() + " Kampanyasýyla " + kampanyaId.getIndirim() + "TL indirim yapýldý.");
	}



}
