
public class StudentManager extends UserManager{
	public void kursaKayitOl(Student user) {
		System.out.println(user.firstName + " " + user.lastName + " '" + user.coursesRegistered + "' kursuna kay�t oldu!");
	}
	
	public void kaydet(Student user) {
		System.out.println("Say�n " + user.firstName + " " + user.lastName + ", ��renci olarak kaydedildi!");
	}
}
