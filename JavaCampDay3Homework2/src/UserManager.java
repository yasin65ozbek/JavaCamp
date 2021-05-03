
public class UserManager {
	
	public void login(User user) {
		System.out.println(user.firstName + " Oturum açtý.");
	}
	
	public void logout(User user) {
		System.out.println(user.firstName + " Çýkýþ yaptý.");
	}
}
