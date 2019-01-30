package FactoryImplementation;

public class Server implements Computer {
	
	@Override
	public void createComputer() {
		System.out.println("SERVER IS CREATED");
	}

}
