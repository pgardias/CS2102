import java.util.Scanner;

public class PrecinctProgram {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Precinct w12 = new Precinct("Worcester 12", "130 Winter Street", 1673);
		System.out.println("Enter the new population: ");
		int newPopulation = keyboard.nextInt();
		System.out.println("Enter the new name: ");
		keyboard.nextLine(); // Skips to the next line to prevent the name
								// reading to be ""
		String newName = keyboard.nextLine();
		System.out.println("Enter the new address: ");
		String newAddress = keyboard.nextLine();
		Precinct newW12 = new Precinct(newName, newAddress, newPopulation);
		System.out.println(newW12.toString());
		// System.out.println(w12.grow(keyboard.nextInt()));
	}
}
