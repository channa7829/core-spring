package in.channa2;

public class UpiPayment implements Ipayment {


	@Override
	public void pay(Double amount) {

		 System.out.println(" Payment "+amount +"  Successfull through UpiPayment");

	}

}
