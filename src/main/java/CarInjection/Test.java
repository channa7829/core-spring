package CarInjection;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.CarStatus();
        // here one class object s injectiong into another class object that
		//that can be done two way 1. inheritance 2. compositation.
		// but these two are not good use as they tightaly coupled.
	}

}
