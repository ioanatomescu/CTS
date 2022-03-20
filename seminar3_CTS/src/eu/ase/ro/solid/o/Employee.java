package eu.ase.ro.solid.o;

public class Employee {
private int Id;
private String name;
private float salary;
private String employeeType;



public Employee(int id, String name,float salary,String employeeType) {
	super();
	Id = id;
	this.name = name;
	this.salary=salary;
	this.employeeType=employeeType;
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
public float calculateBonus() {
	if(this.employeeType=="FTE") {
	    return this.salary*.1f;}
	else
		return this.salary*.05f;
	}



}
