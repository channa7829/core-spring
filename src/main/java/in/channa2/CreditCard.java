package in.channa2;

public class CreditCard implements Ipayment {


	@Override
	public void pay(Double aamount) {

		System.out.println(" Payment "+aamount +"  Successfull through CreditCard");

	}

}
