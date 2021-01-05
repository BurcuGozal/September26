package september26;

public class VerizonBill {
	
	
	
	String customerName;
	String address;
	long accountNo;
	double amountUsedInGB;
	double pricePerGB;
	double amountDue;
	private name;
	
	public VerizonBill() {
		
		this("John", "145 blue rd", 2156413256L, 23, 0.2, 34);
	}
	
	public VerizonBill(String customerName, String address, long accountNo) {
		
		this.customerName = customerName;
		
		this.address = address;
		
		this.accountNo = accountNo;
		
	}
	
	public VerizonBill(CharSequence customerName, String address, long accountNo, double amountUsedInGB, double pricePerGB, double amountDue) {
		
		this(customerName, address, accountNo);
		
		this.amountUsedInGB = amountUsedInGB;
		
		this.pricePerGB = pricePerGB;
		
		this.amountDue = amountDue;
		
		
		
	}
	
	public void printInfo() {
		
		System.out.println("Customer name: " + customerName + "\n" + 
		
						"Address : " + address + "\n" +
						
						"Account number : " + accountNo + "\n" +
						
						"Used amount : " + amountUsedInGB + "\n" +
						
						"Price per GB : " + pricePerGB + "\n" +
						
						"Amount due : " + amountDue);
		
		
	}
	
	public double calculateAmountDue() {
		
		
		return amountDue = amountDue + (amountUsedInGB * pricePerGB);
	}
	
	public double getAmountUsed() {
		
		return this.amountUsedInGB;
		
	}
	
	public void setPricePerGB(double pricePerGB) {
		
		this.pricePerGB = pricePerGB;
		
	}
	
	public void setAmountDue(double amountDue) {
		
		this.amountDue = amountDue;
	}
	
public static void main(String [] args) {
	
	
}
}
