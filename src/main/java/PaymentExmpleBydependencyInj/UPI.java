package PaymentExmpleBydependencyInj;

public class UPI implements Ipayment {

	public void pay(double amount) {
		
		System.out.println(" Payment successfull UPI  :"+amount);
		
	}

}
