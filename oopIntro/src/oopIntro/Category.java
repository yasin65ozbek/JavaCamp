package oopIntro;

public class Category {
	//int id;
	//String name;
	private int id;
	private String name;
	
	public Category() {//Boþ contructors
		
	}
	
	
	//-----Constructors
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//-----Constructors

	
	
	public int getId() {
		return this.id; //id döndürür diðer syafalar eriþebilir ama private iken eriþemez sadece bu þekil eriþebilir
	}
	
	public void setId(int id) {//emir veriyor bir þeyi yapmak için void kullanýlýr bir atama vs.
		this.id = id;
	}
	
	public String getName(){//okunduðunda veri tipi yazýyoruz
		return this.name + "!";
	}
	
	public void setName(String name){//Yazmak için void yazýlýr
		this.name = name;
	}
}
