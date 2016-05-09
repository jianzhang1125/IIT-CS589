import java.util.Scanner;  

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GasPump GP = new GasPump();
		while(true){  
			int return_value = 0;
			print_menu();
			System.out.println("Please enter the operation:");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
				switch (str) {
				case "1":
					System.out.println("GasPump class");
					System.out.println("Activate(float a, float b, float d) method\n");
					System.out.println("Please enter value of a:");
					float a = sc.nextFloat();
					System.out.println("Please enter value of b:");
					float b = sc.nextFloat();
					System.out.println("Please enter value of d:");
					float d = sc.nextFloat();
					return_value = GP.Activate(a, b, d);
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "2":
					System.out.println("GasPump class");
					System.out.println("PayCredit() method\n");
					return_value = GP.PayCredit();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "3":
					System.out.println("GasPump class");
					System.out.println("Reject() method\n");
					return_value = GP.Reject();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "4":
					System.out.println("GasPump class");
					System.out.println("Approved() method\n");
					return_value = GP.Approved();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
					
				case "5":
					System.out.println("GasPump class");
					System.out.println("PayCash(float c) method\n");
					System.out.println("Please enter value of c:");
					float c = sc.nextFloat();
					return_value = GP.PayCash(c);
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "6":
					System.out.println("GasPump class");
					System.out.println("Cancel() method\n");
					return_value = GP.Cancel();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "7":
					System.out.println("GasPump class");
					System.out.println("Regular() method\n");
					return_value = GP.Regular();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
					
				case "8":
					System.out.println("GasPump class");
					System.out.println("Super() method\n");
					return_value = GP.Super();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "9":
					System.out.println("GasPump class");
					System.out.println("Diesel() method\n");
					return_value = GP.Diesel();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
					
				case "10":
					System.out.println("GasPump class");
					System.out.println("StartPump() method\n");
					return_value = GP.StartPump();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
					
				case "11":
					System.out.println("GasPump class");
					System.out.println("PumpLiter() method\n");
					return_value = GP.PumpLiter();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
					
				case "12":
					System.out.println("GasPump class");
					System.out.println("StopPump() method\n");
					return_value = GP.StopPump();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "13":
					System.out.println("GasPump class");
					System.out.println("NoReceipt() method\n");
					return_value = GP.NoReceipt();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
					
				case "14":
					System.out.println("GasPump class");
					System.out.println("Receipt() method\n");
					return_value = GP.Receipt();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
					
				case "15":
					System.out.println("GasPump class");
					System.out.println("TurnOff() method\n");
					return_value = GP.TurnOff();
					System.out.println("The value returned by the method is:" + return_value + "\n");
					System.out.println("*******************************************************\n");
					break;
				
				case "a":
					System.out.println("GasPump class");
					System.out.println("Show_All_Values() testing-related method\n");
					GP.Show_All_Values();
					System.out.println("*******************************************************\n");
					break;
				
				case "b":
					System.out.println("GasPump class");
					System.out.println("Show_State() testing-related method\n");
					System.out.println("Now the system is at: ");
					GP.Show_State();
					System.out.println("*******************************************************\n");
					break;
				
				case "q":
					System.exit(0);
					
				default:
					break;
			}
		}  
	}
	
	public static void print_menu(){
		System.out.println("This is the DRIVER for the GasPump class!\n");
		System.out.println("1.  Active");
		System.out.println("2.  PayCredit");
		System.out.println("3.  Reject");
		System.out.println("4.  Approved");
		System.out.println("5.  PayCash");
		System.out.println("6.  Cancel");
		System.out.println("7.  Regular");
		System.out.println("8.  Super");
		System.out.println("9.  Diesel");
		System.out.println("10. StartPump");
		System.out.println("11. PumpLiter");
		System.out.println("12. StopPump");
		System.out.println("13. NoReceipt");
		System.out.println("14. Receipt");
		System.out.println("15. TurnOff\n");
		
		System.out.println("Testing-related methods");
		System.out.println("a. Show All Values");
		System.out.println("b. Show State\n");
		System.out.println("q. Quit GasPump DRIVER\n");
	}
}
