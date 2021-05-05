package oopIntro;

public class Product {
	//özellik tutan classlar
	//Constructor blok yapýcý blok
	public Product() {
		System.out.println("Ben Çalýþtým");
	}

	//encapsulation Kapsülleme Tekniði
	private int id;// Final demek sadece constractýrlardan set edilebilir anlamýna geliyor
	private String name;//Private : ÖZEL demek; Sadece bu classýn içinde kullanýlabilir
	private double unitPrice; //Birim Fiyatý
	private String detail;
	private double discount; //Ýndirim
	private double unitPriceAfterDiscount; //indirimden sonraki oran   GET ile deðer alacaðý için sað týklayýp sourceda 7. böülmde GET and SET bölümünü seçip sadece geti aktif yap
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {//id'e sað týklayýp sourceda alttan üçüncüde using fieldsen contructer oluþtrulabilir
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
		return this.unitPrice - (this.unitPrice * this.discount / 100); //Var olan fiyat - var olan fiyatýn yüzdesini çýkar 
	}
	
	/*
	public Product(int id,String name,double unitPrice,String detail) {
		this(); //ben çalýþtým bloðunu burada da çalýþtýrýr
		this.id = id; //this bu class demek yani bu classtaki id'i id deðiþkenine baðlar
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	*/
	
}
