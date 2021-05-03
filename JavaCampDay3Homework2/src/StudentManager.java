
public class StudentManager extends UserManager{
	public void kursaKayitOl(Student user) {
		System.out.println(user.firstName + " " + user.lastName + " '" + user.coursesRegistered + "' kursuna kayıt oldu!");
	}
	
	public void kaydet(Student user) {
		System.out.println("Sayın " + user.firstName + " " + user.lastName + ", Öğrenci olarak kaydedildi!");
	}
}
