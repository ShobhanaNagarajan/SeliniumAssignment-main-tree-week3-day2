package week3day2;

public class Desktop  implements Hardware,SoftWare{

	public void softwareResources() {
		System.out.println("Software Resources Method is sucessfully called");
	}
	
	public void hardwareResources() {
		System.out.println("Hardware Resource method is sucessfully called");
	}
	
	public void desktopModel() {
		System.out.println("Desktop Model Method is sucessfully called");
	}
	
	public static void main(String[] args) {
		Desktop desktop =new Desktop();
		desktop.softwareResources();
		desktop.hardwareResources();
		desktop.desktopModel();
	}

	}


