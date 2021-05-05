package staticDemo;
//STAT�C : static olan class newlenerek �a��r�lamaz ancak "classAdi.classAdi" �eklinde �a��r�labilir
//New olarak �a��r�l�nca yani static olmad���nda i�imizi yapt�ktan soonra bellekten at�l�r ama static olarak kullan�ld���nda program sonland�r�lmad�k�a bellekten at�lmaz s�rekli yer kaplar 
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "Mouse";
		manager.add(product);
		
		DatabaseHelper.Crud.Delete();//static oldu�u i�in newlemeye gerek kalm�yor
	}

}
