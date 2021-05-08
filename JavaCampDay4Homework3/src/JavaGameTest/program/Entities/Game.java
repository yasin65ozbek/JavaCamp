package JavaGameTest.program.Entities;

public class Game {
	int id;
	String oyunAdi;
	double fiyati;

	public Game(){
		
	}
	public Game(int id, String oyunAdi, int fiyati) {
		super();
		this.id = id;
		this.oyunAdi = oyunAdi;
		this.fiyati = fiyati;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOyunAdi() {
		return oyunAdi;
	}

	public void setOyunAdi(String oyunAdi) {
		this.oyunAdi = oyunAdi;
	}

	public double getFiyati() {
		return fiyati;
	}

	public void setFiyati(double fiyati) {
		this.fiyati = fiyati;
	}
}
