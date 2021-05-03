
public class Main {

	public static void main(String[] args) {
		Student ogrenci = new Student();
		ogrenci.id = 1;
		ogrenci.firstName = "Yasin";
		ogrenci.lastName = "�ZBEK";
		ogrenci.mailAdress = "yasin65ozbek@gmail.com";
		ogrenci.coursesRegistered = "JAVA Kamp�";

		Instructor ogretmen = new Instructor();
		ogretmen.id = 1;
		ogretmen.firstName = "Engin";
		ogretmen.lastName = "Demiro�";
		ogretmen.mailAdress = "engindemirohoca@gmail.com";
		ogretmen.coursesCreated = "C# Kamp�";
		

		UserManager userManager = new UserManager();
		

		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.kaydet(ogretmen);
		userManager.login(ogretmen);
		�nstructorManager.kursolustur(ogretmen);
		

		
		StudentManager studentManager = new StudentManager();
		studentManager.kaydet(ogrenci);
		userManager.login(ogrenci);
		studentManager.kursaKayitOl(ogrenci);
		userManager.logout(ogrenci);
		
		
	}

}
