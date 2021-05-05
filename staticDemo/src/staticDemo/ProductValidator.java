package staticDemo;
//validator demek kurallara uygun oldup olmama doðruluðunu kontrol için kullanýlýr
public class ProductValidator {
	public boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) { // fiyat 0'dan büyük ve ürün adý boþ deðilse
			return true;
		}else {
			return false;
		}
	}
}
