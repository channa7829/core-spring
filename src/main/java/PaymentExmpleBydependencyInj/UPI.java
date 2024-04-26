package PaymentExmpleBydependencyInj;

public class UPI implements Ipayment {

	@Override
	public void pay(double amount) {

		System.out.println(" Payment successfull UPI  :"+amount);

	}

}
