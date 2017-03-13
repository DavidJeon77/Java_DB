package loginSystem;

import java.util.Scanner;

public class login {

	// getter / setter를 이용해서 loginSystem과 연결
	public void login() {

		Scanner userScan = new Scanner(System.in);

		
		
		System.out.println("Enter User ID : ");

		String userID = userScan.nextLine();

		System.out.println("Enter User PW : ");

		String userPW = userScan.nextLine();

		
		
		Loginsystem loginsystem = new Loginsystem();
			
		loginsystem.setUserID(userID);
		
		loginsystem.setUserPW(userPW);
			
		


	}
}
