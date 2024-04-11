package PaymentExmpleBydependencyInj;

public class DebitCard implements Ipayment {

	public void pay(double amount) {
	
		System.out.println(" Payment successfull vai DebitCard :"+amount);

	}

}
