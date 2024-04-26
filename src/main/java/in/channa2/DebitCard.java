package in.channa2;

public class DebitCard implements Ipayment {


	@Override
	public void pay(Double amountt) {

		System.out.println(" Payment "+amountt +"  Successfull through DebitCard");
	}

}
