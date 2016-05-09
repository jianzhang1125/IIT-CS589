public class GasPump {
	private float Rprice;
	private float Sprice;
	private float Dprice;
	private int w;
	private float price;
	private int L;
	private float total;
	private float cash;
	private int k;

	public GasPump() {
		Rprice = 0;
		Sprice = 0;
		Dprice = 0;
		w = 0;
		price = 0;
		L = 0;
		total = 0;
		cash = 0;
		k = -1;
	}

	public final int Activate(float a, float b, float d) {
		if ((k == -1) && (a > 0) && (b > 0) && (d > 0)) {
			k = 0;
			Rprice = a;
			Sprice = b;
			Dprice = d;
			System.out.print("GAS PUMP IS ON");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}

	}

	public final int PayCredit() {
		if (k == 0) {
			k = 2;
			System.out.print("CHECKING CREDIT CARD.");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Reject() {
		if (k == 2) {
			k = 0;
			System.out.print("CREDIT CARD IS REJECTED.");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Cancel() {
		if ((k == 3) || (k == 4)) {
			k = 0;
			System.out.print("TRANSACTION IS CANCELLED.");
			System.out.print("\n");
			if (w == 0) {
				System.out.print("$");
				System.out.print(cash);
				System.out.print(" OF CASH IS RETURNED");
				System.out.print("\n");
			}
			return 1;
		} else {
			return 0;
		}
	}

	public final int Approved() {
		if (k == 2) {
			k = 3;
			w = 1;
			System.out.print("CREDIT CARD APPROVED.");
			System.out.print("\n");
			System.out.print("SELECT TYPE OF GASOLINE:");
			System.out.print("\n");
			System.out.print("a. REGULAR");
			System.out.print("\n");
			System.out.print("b. SUPER");
			System.out.print("\n");
			System.out.print("c. DIESEL");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int PayCash(float c) {
		if ((k == 0) && (c > 0)) {
			k = 3;
			w = 0;
			cash = c;
			System.out.print("SELECT TYPE OF GASOLINE:");
			System.out.print("\n");
			System.out.print("a. REGULAR");
			System.out.print("\n");
			System.out.print("b. SUPER");
			System.out.print("\n");
			System.out.print("c. DIESEL");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Regular() {
		if (k == 3) {
			k = 4;
			System.out.print("REGULAR IS SELECTED.");
			System.out.print("\n");
			price = Rprice;
			return 1;
		} else {
			return 0;
		}
	}

	public final int Super() {
		if (k == 3) {
			k = 4;
			System.out.print("SUPER IS SELECTED.");
			System.out.print("\n");
			price = Sprice;
			return 1;
		} else {
			return 0;
		}
	}

	public final int Diesel() {
		if (k == 3) {
			k = 4;
			System.out.print("DIESEL IS SELECTED.");
			System.out.print("\n");
			price = Dprice;
			return 1;
		} else {
			return 0;
		}
	}

	public final int StartPump() {
		if (k == 4) {
			k = 5;
			L = 0;
			total = 0;
			System.out.print("PUMP IS READY TO DISPOSE ");
			System.out.print("\n");
			System.out.print("# OF LITERS PUMPED: ");
			System.out.print(L);
			System.out.print("\n");
			System.out.print("TOTAL CHARGE: $");
			System.out.print(total);
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int PumpLiter() {
		if (k == 5) {
			if ((w == 1) || ((cash >= price * (L + 1)) && (w == 0))) {
				L = L + 1;
				total = L * price;
				System.out.print("# OF LITERS PUMPED: ");
				System.out.print(L);
				System.out.print("\n");
				System.out.print("TOTAL CHARGE: $");
				System.out.print(total);
				System.out.print("\n");
				System.out.print("CONTINUE PUMPING");
				System.out.print("\n");
				return 1;
			} else if ((w == 0) && (cash < price * (L + 1))) {
				k = 6;
				System.out.print("PUMP STOPPED. NOT SUFFICIENT FUNDS. ");
				System.out.print("\n");
				System.out.print("# OF LITERS PUMPED: ");
				System.out.print(L);
				System.out.print("\n");
				System.out.print("TOTAL CHARGE: $");
				System.out.print(total);
				System.out.print("\n");
				if ((w == 0) && (total < cash)) {
					System.out.print("$");
					System.out.print(cash - total);
					System.out.print(" OF CASH IS RETURNED");
					System.out.print("\n");
				}
				System.out.print("DO YOU WANT A RECEIPT?");
				System.out.print("\n");
				return 1;
			}
			;
		}
		;
		return 0;
	}

	public final int StopPump() {
		if (k == 5) {
			k = 6;
			System.out.print("PUMP STOPPED. ");
			System.out.print("\n");
			System.out.print("# OF LITERS PUMPED: ");
			System.out.print(L);
			System.out.print("\n");
			System.out.print("TOTAL CHARGE: $");
			System.out.print(total);
			System.out.print("\n");
			if ((w == 0) && (total < cash)) {
				System.out.print("$");
				System.out.print(cash - total);
				System.out.print(" OF CASH IS RETURNED");
				System.out.print("\n");
			}
			System.out.print("DO YOU WANT A RECEIPT?");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int NoReceipt() {
		if (k == 6) {
			k = 0;
			System.out.print("NO RECEIPT IS PRINTED ");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int Receipt() {
		if (k == 6) {
			k = 0;
			System.out.print("RECEIPT IS PRINTED: ");
			System.out.print("\n");
			System.out.print("# OF LITERS PUMPED: ");
			System.out.print(L);
			System.out.print("\n");
			System.out.print("TOTAL CHARGE: $");
			System.out.print(total);
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}

	public final int TurnOff() {
		if (k == 0) {
			k = -2;
			System.out.print("GAS PUMP IS TURNED OFF ");
			System.out.print("\n");
			return 1;
		} else {
			return 0;
		}
	}
}