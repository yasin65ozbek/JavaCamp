package JavaGameTest.program.abstracts;

import JavaGameTest.program.Entities.Game;

public interface IGameManager {

	void oyunEkle(Game game);
	void oyunGuncelle(Game game);
	void oyunSil(Game game);
}
