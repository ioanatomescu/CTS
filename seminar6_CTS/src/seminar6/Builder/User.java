package seminar6.Builder;

public class User {
   //mandatory
   String username;
   String password;
   String email;
   //optional
   String address;
   String phoneNo;
   String birthDay;
public User(String username, String password, String email, String address, String phoneNo, String birthDay) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.address = address;
	this.phoneNo = phoneNo;
	this.birthDay = birthDay;
}
public User(String username, String password, String email, String address) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.address = address;
}
public User(String username, String password, String email, String phoneNo) {
	super();
	this.username = username;
	this.password = password;
	this.email = email;
	this.phoneNo = phoneNo;
}
      
}
