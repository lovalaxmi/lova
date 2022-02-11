package opps;

import java.util.Arrays;

public class Office {
	private String companyName;
	private long totoalemploys;
	private  Experiance[] experiance;
	private Details details;
	
	public String getcompanyName() {
		return companyName;
}
	public long gettotoalemploys() {
		return totoalemploys;
	}
	public Experiance[] getexperiance() {
	return experiance;
}
	public Details getdetails() {
		return details;
	}
	Office(String companyName, long totoalemploys,Experiance[] experiance,Details details ){
		this.companyName=companyName;
		this.totoalemploys=totoalemploys;
		this.experiance=experiance;
		this.details=details;
	}
	public String toString() {
		return "office[complanyName="+companyName+" "+"totoalemploys="+totoalemploys+" "+"Experiance="+Arrays.toString(experiance)+" "+"Details="+details+"]";
	}

}
