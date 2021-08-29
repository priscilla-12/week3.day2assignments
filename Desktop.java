package week3.day2assignments;

public class Desktop implements Software {

	
	public void hardwareResource(String cpu, int Ram, String motherboard) {
		String connection = cpu;
		int ramSize = Ram;
		String type = motherboard;
		System.out.println("connection of cpu= "+connection);
		System.out.println(" Ram size = "+ramSize);
		System.out.println(" motherboard = "+type);
		
		
	}

	public void softwareResource1(String internet, int windows10) {
		String browser = internet;
		int version = windows10;
		System.out.println("browser used = "+browser);
		System.out.println("the  window version = "+version);
		
	}
public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.hardwareResource("wired", 65,"mouse");
		desk.softwareResource("firefox", 10);
	}

public void softwareResource(String internet, int windows10) {
	// TODO Auto-generated method stub
	
}

 

}
