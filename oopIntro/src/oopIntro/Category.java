package oopIntro;

public class Category {
	//int id;
	//String name;
	private int id;
	private String name;
	
	public Category() {//Bo� contructors
		
	}
	
	
	//-----Constructors
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//-----Constructors

	
	
	public int getId() {
		return this.id; //id d�nd�r�r di�er syafalar eri�ebilir ama private iken eri�emez sadece bu �ekil eri�ebilir
	}
	
	public void setId(int id) {//emir veriyor bir �eyi yapmak i�in void kullan�l�r bir atama vs.
		this.id = id;
	}
	
	public String getName(){//okundu�unda veri tipi yaz�yoruz
		return this.name + "!";
	}
	
	public void setName(String name){//Yazmak i�in void yaz�l�r
		this.name = name;
	}
}
