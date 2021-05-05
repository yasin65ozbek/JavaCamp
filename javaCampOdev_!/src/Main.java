
public class Main {
	public static void main(String[] args) {
		Course Course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.","Engin Demirog",0);
		Course Course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.","Engin Demirog",0);
		Course Course3 = new Course(2, "Programlamaya Giri� i�in Temel Kurs","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.","Engin Demirog",0);

		Course[] Courses = {Course1,Course2,Course3}; 

		for(int i = 0; i<Courses.length;i++) {
			System.out.println(Courses[i].name);
			System.out.println(Courses[i].detail);
			System.out.println(Courses[i].teacher);
			if(Courses[i].unitPrice == 0.0) {
				System.out.println("�cretsiz");
			}else {
				System.out.println(Courses[i]);
			}
		}
		

		CourseManager CourseManager= new CourseManager();
		CourseManager.addToCart(Course1);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "T�m�";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Programlama";
		
		System.out.println(category1.name);
		System.out.println(category2.name);
		
	}
}
