package PaymentExmpleBydependencyInj;

public class CreditCard implements Ipayment {

	public void pay(double amount) {
		
		System.out.println(" Payment successfull vai CreditCard :"+amount);

	}

}
