package JavaGameTest.program.Entities;

public class Kampanya {
	private int id;
	private String kampanyaAdi;
	private int indirim;
	
	public Kampanya(int id, String kampanyaAdi, int indirim) {
		super();
		this.id = id;
		this.kampanyaAdi = kampanyaAdi;
		this.indirim = indirim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKampanyaAdi() {
		return kampanyaAdi;
	}

	public void setKampanyaAdi(String kampanyaAdi) {
		this.kampanyaAdi = kampanyaAdi;
	}

	public int getIndirim() {
		return indirim;
	}

	public void setIndirim(int indirim) {
		this.indirim = indirim;
	}
}
