import laptop.Laptop;
import laptop.LaptopAdapter;
import refrigerator.Refrigerator;
import refrigerator.RefrigeratorAdapter;
import smartphoneCharger.SmartphoneCharger;
import smartphoneCharger.SmartphoneChargerAdapter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\n1 - Laptop");
			System.out.println("2 - Refrigerator");
			System.out.println("3 - SmartphoneCharger");
			System.out.println("4 - Exit\n");
			
			System.out.print("Enter your choice: ");
			
			int input = scanner.nextInt();
			switch (input) {
				case 1:
					Laptop laptop = new Laptop();
					
					System.out.print("Enter voltage: ");
					laptop.setVoltage(scanner.nextDouble());
					
					System.out.print("Enter amperage: ");
					laptop.setAmperage(scanner.nextDouble());
					
					System.out.print("Enter plug type: ");
					laptop.setPlugType(scanner.next());
					
					LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
					
					laptopAdapter.plugin();
					break;
				case 2:
					Refrigerator refrigerator = new Refrigerator();
					
					System.out.print("Enter voltage: ");
					refrigerator.setVoltage(scanner.nextDouble());
					
					System.out.print("Enter amperage: ");
					refrigerator.setAmperage(scanner.nextDouble());
					
					System.out.print("Enter plug type: ");
					refrigerator.setPlugType(scanner.next());
					
					RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
					
					refrigeratorAdapter.plugin();
					break;
				case 3:
					SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
					
					System.out.print("Enter voltage: ");
					smartphoneCharger.setVoltage(scanner.nextDouble());
					
					System.out.print("Enter amperage: ");
					smartphoneCharger.setAmperage(scanner.nextDouble());
					
					System.out.print("Enter plug type: ");
					smartphoneCharger.setPlugType(scanner.next());
					
					SmartphoneChargerAdapter smartphoneChargerAdapter = new SmartphoneChargerAdapter(smartphoneCharger);
					
					smartphoneChargerAdapter.plugin();
					break;
				case 4:
					System.out.println("Exit - John Victor Gonzales");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice");
					break;
			}
		} while (true);
	}
}