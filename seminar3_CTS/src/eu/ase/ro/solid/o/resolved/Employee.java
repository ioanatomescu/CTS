package eu.ase.ro.solid.o.resolved;

public abstract class Employee {
private int Id;
private String name;
private float salary;
private String employeeType;



public Employee(int id, String name,float salary) {
	super();
	Id = id;
	this.name = name;
	this.salary=salary;
	
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Employee [Id=");
	builder.append(Id);
	builder.append(", name=");
	builder.append(name);
	builder.append(", salary=");
	builder.append(salary);
	builder.append(" , employee type= ");
	builder.append(employeeType);
	builder.append("]");
	return builder.toString();
}
public abstract float calculateBonus() ;


}
