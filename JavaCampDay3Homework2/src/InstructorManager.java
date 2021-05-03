
public class InstructorManager extends UserManager{
	public void kursolustur(Instructor user) {
		System.out.println(user.firstName + " " + user.lastName + " '" + user.coursesCreated + "' kursunu Oluþturdu..");
	}

	public void kaydet(Instructor user) {
		System.out.println(user.firstName + " " + user.lastName + " Hoca, Öðretmen olarak kaydedildi!");
	}
}
