package JavaGameTest.program.concretes;

import JavaGameTest.program.Entities.Game;
import JavaGameTest.program.abstracts.IGameManager;

public class GameManager implements IGameManager{

	@Override
	public void oyunEkle(Game game) {
		System.out.println(game.getOyunAdi() + "(" + game.getFiyati() + ")" + " - isimli oyun eklendi");
	}

	@Override
	public void oyunGuncelle(Game game) {
		System.out.println(game.getOyunAdi() + "(" + game.getFiyati() + ")" + " - isimli oyun güncellendi");
	}

	@Override
	public void oyunSil(Game game) {
		System.out.println(game.getOyunAdi() + "(" + game.getFiyati() + ")" + " - isimli oyun silindi");
	}

}
