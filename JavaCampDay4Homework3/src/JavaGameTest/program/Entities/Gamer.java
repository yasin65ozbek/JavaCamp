package JavaGameTest.program.Entities;

import JavaGameTest.program.abstracts.Entity;

public class Gamer implements Entity{
	int id;
	String ad;
	String soyad;
	int tcNo;
	String dogumYili;
	
	//boþ bir constructor
	public Gamer(){
		
	}
	
	public Gamer(int id, String ad, String soyad, int tcNo, String dogumYili) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.tcNo = tcNo;
		this.dogumYili = dogumYili;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public String getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(String dogumYili) {
		this.dogumYili = dogumYili;
	}
}
