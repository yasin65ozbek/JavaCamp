
public class Main {

	public static void main(String[] args) {
		Student ogrenci = new Student();
		ogrenci.id = 1;
		ogrenci.firstName = "Yasin";
		ogrenci.lastName = "ÖZBEK";
		ogrenci.mailAdress = "yasin65ozbek@gmail.com";
		ogrenci.coursesRegistered = "JAVA Kampý";

		Instructor ogretmen = new Instructor();
		ogretmen.id = 1;
		ogretmen.firstName = "Engin";
		ogretmen.lastName = "Demiroð";
		ogretmen.mailAdress = "engindemirohoca@gmail.com";
		ogretmen.coursesCreated = "C# Kampý";
		

		UserManager userManager = new UserManager();
		

		InstructorManager ýnstructorManager = new InstructorManager();
		ýnstructorManager.kaydet(ogretmen);
		userManager.login(ogretmen);
		ýnstructorManager.kursolustur(ogretmen);
		

		
		StudentManager studentManager = new StudentManager();
		studentManager.kaydet(ogrenci);
		userManager.login(ogrenci);
		studentManager.kursaKayitOl(ogrenci);
		userManager.logout(ogrenci);
		
		
	}

}
