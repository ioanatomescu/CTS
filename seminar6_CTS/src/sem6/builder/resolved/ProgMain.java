package sem6.builder.resolved;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              //User user1= new User("ioana21","1234","ioana@stud.ase.ro","bucharest","0478121478","21.12.1999");
              //User user2= new User("ioana21","1234","ioana@stud.ase.ro","bucharest");
              //User user3 = new User("ioana21","1234","ioana@stud.ase.ro","78541254");
              User user=new User.UserBuilder("ioana21","451","ioana@stud.ase.ro").address("bucharest").build();
	}

}
