package memento;

public class Contract {
 private String clientName;
 private String clauseContract;
public String getClientName() {
	return clientName;
}
public void setClientName(String clientName) {
	this.clientName = clientName;
}
public String getClauseContract() {
	return clauseContract;
}
public void setClauseContract(String clauseContract) {
	this.clauseContract = clauseContract;
}
public Contract(String clientName) {
	super();
	this.clientName = clientName;
	this.clauseContract = clauseContract;
}
 public void addClause(String newClause) {
	 this.clauseContract+="\n"+newClause;
 }
 
 public void restoreFromVersions(String ClauseVersion) {
	// this.clauseContract;
 }
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
 //save version

public void restoreFromVersion(ContractVersion clauseVersion) {
	System.out.println("Restore a specific version of the contract");
	this.clauseContract=clauseVersion.getClauseVersion();
	
}

public ContractVersion saveVersion() {
	System.out.println("Save version of the contract");
	return new ContractVersion(this.clauseContract);
}
}
