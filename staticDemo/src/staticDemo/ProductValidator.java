package staticDemo;
//validator demek kurallara uygun oldup olmama do�rulu�unu kontrol i�in kullan�l�r
public class ProductValidator {
	public boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) { // fiyat 0'dan b�y�k ve �r�n ad� bo� de�ilse
			return true;
		}else {
			return false;
		}
	}
}
