package sem6.builder.resolved;

public  class User {
   //mandatory
   String username;
   String password;
   String email;
   //optional
   String address;
   String phoneNo;
   String birthDay;
public User(UserBuilder ub) {
	super();
	this.username = ub.username;
	this.password = ub.password;
	this.email = ub.email;
	this.address = ub.address;
	this.phoneNo = ub.phoneNo;
	this.birthDay = ub.birthDay;
}
public class UserBuilder{
	 //mandatory
	   String username;
	   String password;
	   String email;
	   //optional
	   String address;
	   String phoneNo;
	   String birthDay;
	  public  UserBuilder(String username,String password,String email){
		   this.username=username;
		   this.password=password;
		   this.email=email;
	   }
	   
	   UserBuilder address(String address) {
		   this.address=address;
		   return this;
	   }
	   
	   UserBuilder phoneNo(String phoneNo) {
		   this.phoneNo=phoneNo;
		   return this;
	   }
	   UserBuilder birthday(String birthday) {
		   this.birthDay=birthday;
		   return this;
	   }
	   
	   public User build() {
		   User user= new User(this);
		   return user;
	   }
	   
}
      
}
