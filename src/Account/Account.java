//Java Bean Class: Creating Getter Setter for the Privately declared variables

package Account;

public class Account {
	
	private String Accholdername ;
	private long Accnumber;
	private double Accbalance; 
	
	public String getAccholdername() {
		return Accholdername;
	}
	
	public void setAccholdername(String accholdername) {
		Accholdername = accholdername;
	}
	
	public long getAccnumber() {
		return Accnumber;
	}
	
	public void setAccnumber(long accnumber) {
		Accnumber = accnumber;
	}
	
	public double getAccbalance() {
		return Accbalance;
	}
	
	public void setAccbalance(double accbalance) {
		Accbalance = accbalance;
	}
	
	
}
