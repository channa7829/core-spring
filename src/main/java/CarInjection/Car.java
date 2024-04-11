package CarInjection;

public class Car{
	
	//public class Car extends Engine  - by inheritance
	//2nd method by compositation -Engine startEngine = new Engine();
	
	Engine startEngine = new Engine();
	
	public void CarStatus() {
		
		int startEngine1 = startEngine.startEngine();
		
		if (startEngine1==1) {
			System.out.println(" engine started");
			System.out.println(" Car is ready to move");
		}else {
			System.out.println("There is a problem at engine to start");
		}
		
	}

}
