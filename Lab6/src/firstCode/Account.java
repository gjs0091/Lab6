package firstCode;

public class Account {

	public Account() {
	String password;
	String username;
	int accountNumber;
	int yearCreated;
	}
	public boolean checkPassword(String temppassword) {
		if(password.isEquals(temppassword)) return true;
		
	}
	public int getYearCreated() {
		return yearCreated;
	}
}
