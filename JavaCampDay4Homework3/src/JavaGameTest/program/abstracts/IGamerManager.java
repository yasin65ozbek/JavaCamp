package JavaGameTest.program.abstracts;

import JavaGameTest.program.Entities.Gamer;

public interface IGamerManager {
	void kayitOl(Gamer gamer);
	void kayitGuncelle(Gamer gamer);
	void kayitSil(Gamer gamer);
	
	Gamer get(int id);
	//List<Gamer> getAll();
}
