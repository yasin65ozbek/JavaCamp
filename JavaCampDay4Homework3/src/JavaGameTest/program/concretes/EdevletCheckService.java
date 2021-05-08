package JavaGameTest.program.concretes;

import JavaGameTest.program.Entities.Gamer;
import JavaGameTest.program.core.Dogrulama;

public class EdevletCheckService implements Dogrulama{

	@Override
	public boolean dogrula(Gamer gamer) {
		System.out.println("Mernis sistemi aktif, kontrol ediliyor...");
		
		int tcNo = gamer.getTcNo();
		
        String tcNoString = String.valueOf(tcNo);
		
		if(tcNoString.length() == 10) {
			
			System.out.println(gamer.getAd()+ " " + gamer.getSoyad()+ " " + " adlı kullanıcı başarıyla doğrulandı.");
			return true;

		}else {
			
			System.out.println("Hesap doğrulama başarısız!");
			return false;
		}
	}
	
}
