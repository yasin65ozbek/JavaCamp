
public class Course {
	int id;
	String name;
	String detail;
	String teacher;
	double unitPrice;
	

	public Course(int id,String name,String detail,String teacher,double unitPrice) {
		this.id = id; //this bu class demek yani bu classtaki id'i id de�i�kenine ba�lar
		this.name = name;
		this.detail = detail;
		this.teacher = teacher;
		this.unitPrice = unitPrice;
	}
}
