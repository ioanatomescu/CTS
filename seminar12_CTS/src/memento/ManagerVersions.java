package memento;

import java.util.ArrayList;

public class ManagerVersions {
      private ArrayList<ContractVersion> contractVersion= new ArrayList<ContractVersion>();

	public ArrayList<ContractVersion> getContractVersion() {
		return contractVersion;
	}

	public ManagerVersions() {
		super();
	}

	public void setContractVersion(ArrayList<ContractVersion> contractVersion) {
		this.contractVersion = contractVersion;
	}
      public void addVersion(ContractVersion newContractVersion) {
    	  this.contractVersion.add(newContractVersion);
      }
      public ContractVersion recoveryVersionContract(int nrVersion) {
    	  return this.contractVersion.get(nrVersion);
      }
}
