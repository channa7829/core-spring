package PaymentExmpleBydependencyInj;

public class PaymentExmpleBydependencyInjection {

	public static void main(String[] args) {

		BillCollector billclt = new BillCollector();
		billclt.setIpayment(new UPI());
		billclt.payBill(2000.6);

	}

}
