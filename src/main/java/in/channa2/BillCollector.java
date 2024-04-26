package in.channa2;

public class BillCollector {

	public Ipayment ipayment;

	public double amount;


	public BillCollector() {

	}


	public BillCollector(Ipayment ipayment, double amount) {
		super();
		this.ipayment = ipayment;
		this.amount = amount;

		System.out.println("Defendence is happened Constructor");
	}


	public void collectbill(double amount) {

		try {
			ipayment.pay(amount);
		} catch (Exception e) {
			System.out.println("Payment Failure  : "+e.getMessage());
		}

	}

}
