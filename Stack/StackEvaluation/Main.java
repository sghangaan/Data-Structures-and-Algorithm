package Stack.StackEvaluation;

import java.util.Scanner;
public class Main {

public static String user;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("\n-----| EVALUATING PREFIX/POSTFIX EXPRESSIONS |-----#");
		
		System.out.print("\nEnter Expression: ");
		user=in.nextLine();
		
		do {
			Utils.input=user;
			Utils.validate();
			System.out.println("Input is valid");
			notation.input=user;
			notation.check();
			System.out.println("Input is "+notation.say);
			
			if (notation.pre) {
				notation.input = user;
				notation.pre();
			} else if (notation.post) {
				notation.input = user;
				notation.post();
			} else if (notation.inf) {
				convert.input = user;
				convert.choose();
			}
			Utils.convAn();
		} while (Utils.exit==false);

	}
    
}
