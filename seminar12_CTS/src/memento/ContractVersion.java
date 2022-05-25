package memento;

public class ContractVersion {
  private String clauseVersion;

public ContractVersion(String clauseVersion) {
	super();
	this.clauseVersion = clauseVersion;
}

public String getClauseVersion() {
	return this.clauseVersion;
}

public void setClauseVersion(String clauseVersion) {
	this.clauseVersion = clauseVersion;
}
  
}
