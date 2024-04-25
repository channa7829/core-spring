package JavaConfigCustomBean;

public class College {
	
	public Location loc;

	public College(Location loc) {
		this.loc = loc;
		System.out.println(" injecting loc");
	}
	
	public void info(){
		System.out.println("  college   |   location ");
		System.out.println("   sksmak   |   "+loc.locationdtls());
	}
}
