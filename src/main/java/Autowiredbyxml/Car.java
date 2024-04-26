package Autowiredbyxml;

public class Car {

	public DeselEngine deselEngine;

	public void setDeselEngine(DeselEngine deselEngine) {
		System.out.println(" setting the deselEngine obj");
		this.deselEngine = deselEngine;
	}



//	public Car(DeselEngine deselEngine) {
//		System.out.println(" constructor invoked");
//		this.deselEngine = deselEngine;
//	}
//


	public void startCar() {
		deselEngine.IgniteEngine();
	}

}
