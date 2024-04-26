package PaymentExmpleBydependencyInj;

public class DebitCard implements Ipayment {

	@Override
	public void pay(double amount) {

		System.out.println(" Payment successfull vai DebitCard :"+amount);

	}

}
