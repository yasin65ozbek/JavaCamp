package oopIntro;

public class Product {
	//�zellik tutan classlar
	//Constructor blok yap�c� blok
	public Product() {
		System.out.println("Ben �al��t�m");
	}

	//encapsulation Kaps�lleme Tekni�i
	private int id;// Final demek sadece constract�rlardan set edilebilir anlam�na geliyor
	private String name;//Private : �ZEL demek; Sadece bu class�n i�inde kullan�labilir
	private double unitPrice; //Birim Fiyat�
	private String detail;
	private double discount; //�ndirim
	private double unitPriceAfterDiscount; //indirimden sonraki oran   GET ile de�er alaca�� i�in sa� t�klay�p sourceda 7. b��lmde GET and SET b�l�m�n� se�ip sadece geti aktif yap
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {//id'e sa� t�klay�p sourceda alttan ���nc�de using fieldsen contructer olu�trulabilir
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {//
		return name;
	}

	public void setName(String name) {//
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100); //Var olan fiyat - var olan fiyat�n y�zdesini ��kar 
	}
	
	/*
	public Product(int id,String name,double unitPrice,String detail) {
		this(); //ben �al��t�m blo�unu burada da �al��t�r�r
		this.id = id; //this bu class demek yani bu classtaki id'i id de�i�kenine ba�lar
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	*/
	
}
