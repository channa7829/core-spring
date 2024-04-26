package PaymentExmpleBydependencyInj;

public class BillCollector {

	public Ipayment ipayment;

	public void setIpayment(Ipayment ipayment) {
		this.ipayment = ipayment;
	}

	public void payBill(Double amt) {
		ipayment.pay(amt);
	}

}
