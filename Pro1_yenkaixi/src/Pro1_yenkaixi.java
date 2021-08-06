import java.io.*;

public class Pro1_yenkaixi {

	public static void main(String[] args) throws IOException {
		
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		String strInput;
		int Fizz = 1;
		int Buzz = 1;
		int start, end;
		while (Fizz !=0 & Buzz !=0) {
			System.out.println("   JAVA FIZZBUZZ PROGRAM");
			
			System.out.print("Enter Fizz number: ");
			strInput = cin.readLine();
			Fizz = Integer.parseInt(strInput);
			while (Fizz < 0) {
				System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
				strInput = cin.readLine();
				Fizz = Integer.parseInt(strInput);
			}
			if (Fizz == 0) {
				System.out.print("\n");
				System.out.print("The end." + "\n");
				return;
			}
			
			System.out.print("Enter Buzz number: ");
			strInput = cin.readLine();
			Buzz = Integer.parseInt(strInput);
			
			while (Buzz < 0) {
				System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
				strInput = cin.readLine();
				Buzz = Integer.parseInt(strInput);
			}
			if (Buzz == 0) {
				System.out.print("\n");
				System.out.print("The end." + "\n");
				return;
			}
			
			System.out.print("Enter starting number: ");
			strInput = cin.readLine();
			start = Integer.parseInt(strInput);
			
			System.out.print("Enter ending number: ");
			strInput = cin.readLine();
			end = Integer.parseInt(strInput);
			
			while (end < start) {
				System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
				strInput = cin.readLine();
				end = Integer.parseInt(strInput);
			}
			System.out.print("\n");
			
			for (int i = start; i < end+1 ; i++) {
				//System.out.println("Current number: "+ i);
				if (i % Fizz == 0) {
					if (i % Buzz == 0) {
						System.out.println(i + "." + " FizzBuzz");
					}
					else {
						System.out.println(i + "." + " Fizz");
					}
				}
				else if (i % Buzz == 0) {
					System.out.println(i + "." + " Buzz");
				}
				else {
					System.out.println(i + ". " + i);
				}
			}
			System.out.print("\n");
		}
	}
		

}
