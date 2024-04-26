package in.channa;

public class CreditCard implements Ipayment {


	@Override
	public void pay(Double aamount) {

		System.out.println(" Payment "+aamount +"  Successfull through CreditCard");

	}

}
