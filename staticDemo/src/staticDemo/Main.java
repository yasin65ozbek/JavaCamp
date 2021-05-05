package staticDemo;
//STATÝC : static olan class newlenerek çaðýrýlamaz ancak "classAdi.classAdi" þeklinde çaðýrýlabilir
//New olarak çaðýrýlýnca yani static olmadýðýnda iþimizi yaptýktan soonra bellekten atýlýr ama static olarak kullanýldýðýnda program sonlandýrýlmadýkça bellekten atýlmaz sürekli yer kaplar 
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "Mouse";
		manager.add(product);
		
		DatabaseHelper.Crud.Delete();//static olduðu için newlemeye gerek kalmýyor
	}

}
