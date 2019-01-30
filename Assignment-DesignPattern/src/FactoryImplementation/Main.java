package FactoryImplementation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String comp;
		Scanner sc=new Scanner(System.in);
		int c=1;
		do {
			try {
				System.out.println("Enter the computer type: ");
				comp=sc.next();
				ComputerFactory cf=ComputerFactory.getInstance();
				cf.create(comp).createComputer();
				
			}
			catch(NullPointerException e){
				System.out.println("Enter valid input:");
			
		}
		finally {
			System.out.println("Enter 1 to continue");
			c=sc.nextInt();
		}

	}while(c==1);
	sc.close();

	}
}
