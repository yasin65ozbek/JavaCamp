
public class Main {
	public static void main(String[] args) {
		Course Course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.","Engin Demirog",0);
		Course Course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.","Engin Demirog",0);
		Course Course3 = new Course(2, "Programlamaya Giriþ için Temel Kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.","Engin Demirog",0);

		Course[] Courses = {Course1,Course2,Course3}; 

		for(int i = 0; i<Courses.length;i++) {
			System.out.println(Courses[i].name);
			System.out.println(Courses[i].detail);
			System.out.println(Courses[i].teacher);
			if(Courses[i].unitPrice == 0.0) {
				System.out.println("Ücretsiz");
			}else {
				System.out.println(Courses[i]);
			}
		}
		

		CourseManager CourseManager= new CourseManager();
		CourseManager.addToCart(Course1);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Tümü";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Programlama";
		
		System.out.println(category1.name);
		System.out.println(category2.name);
		
	}
}
