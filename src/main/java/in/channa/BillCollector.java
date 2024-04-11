package in.channa;

public class BillCollector { 

	public Ipayment ipayment;
	
	public double amount; 
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setIpayment(Ipayment ipayment) {
		this.ipayment = ipayment;
		System.out.println("Object injected by Spring...."); 
	}
	
	public void collectbill(double amount) {
		
		try {
			ipayment.pay(amount);
		} catch (Exception e) {
			System.out.println("Payment Failure  : "+e.getMessage());
		}
		
	}

}
