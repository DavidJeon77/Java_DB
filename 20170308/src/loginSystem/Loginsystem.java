package loginSystem;

public class Loginsystem {

	private final static String serverID = "qwer";
	private String serverPW = "1234";

	private String userID;
	private String userPW;

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public int resultOfLogin;

	private void login_System() {

		while (true) {

			if (userID.equals(serverID) && userPW.equals(serverPW)) {
				resultOfLogin = 1;
				System.out.println("welcome " + serverID + " !!");
				break;
			} else {
				resultOfLogin = 2;
				System.out.println("check your ID & PW");
				continue;
			}

		}

	}

}
