package PaymentExmpleBydependencyInj;

public class CreditCard implements Ipayment {

	@Override
	public void pay(double amount) {

		System.out.println(" Payment successfull vai CreditCard :"+amount);

	}

}
