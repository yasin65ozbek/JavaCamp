package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14",15000,"16 GB Ram",10); //class olu�tururken b�yle olmal� Referans olu�turma, intance
		
		Product product2 = new Product(); // Class b�yle olu�turulur
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);//parametre �eklinde de�er veriyoruz
		product2.setUnitPrice(10000);

		System.out.println("�r�n Ad�: " + product2.getName());
		System.out.println("Fiyat�: " + product2.getUnitPrice());
		System.out.println("�ndirim Oran�: %" + product2.getDiscount());

		System.out.println("�ndirimli Fiyat�: " + product2.getUnitPriceAfterDiscount());//fiyat�n indirim eklenmi� halini g�sterir
		
		/* S�L
		product2.id = 1;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		product2.discount = 10;
		product2.unitPriceAfterDiscount = 14400;
		*/
		
		Category category1 = new Category();
		//category1.id = 1;
		//category1.name = "��ecek";
		category1.setId(1);
		category1.setName("��ecek");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}
}
