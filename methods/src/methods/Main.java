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
		System.out.println("Buras� say� bulmada oyunu");
	}
	public static void isimSor(String adiniz) {
		System.out.println("Merhaba ad�n�z : " + adiniz);
	}
}
