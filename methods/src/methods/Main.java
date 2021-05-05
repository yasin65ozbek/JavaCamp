package methods;

public class Main {
	public static void main (String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		
		String adiniz;
		adiniz = "Yasin";
		isimSor(adiniz);
	}
	
	public static void sayiBulmaca() {
		System.out.println("Burasý sayý bulmada oyunu");
	}
	public static void isimSor(String adiniz) {
		System.out.println("Merhaba adýnýz : " + adiniz);
	}
}
