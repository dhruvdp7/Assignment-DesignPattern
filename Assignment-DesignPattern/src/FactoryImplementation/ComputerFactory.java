package FactoryImplementation;

public class ComputerFactory {
	private static ComputerFactory cf;
	private ComputerFactory() {}
	
	public static ComputerFactory getInstance() {
		if(cf==null) {
		 cf=new ComputerFactory();
			
		}
		return cf;
		}
	
	public static Computer create(String s) {
		if(s.equalsIgnoreCase("server"))
		{
			return new Server();
		}
		if(s.equalsIgnoreCase("pc")) {
			return new Pc();
			
		}
		return null;
	}
		
		
		
	}


