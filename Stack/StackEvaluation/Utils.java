package Stack.StackEvaluation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Utils {
	public static String input;
	public static boolean exit=false;
	
	public static void validate() {
		if (invNum()) {
			System.out.println("Input has no Numerical value/s");
			reEnter();
		} else if (chkAlph()) {
			System.out.println("Input has Letters; Use only Numbers");
			reEnter();
		} else if (chkOp()) {
			System.out.println("Input has no Operators");
			reEnter();
		} else if (chkSpc()) {
			System.out.println("Put Spaces between Numbers and Operators");
			reEnter();
		}
	}
	
	private static boolean invNum() {
		Pattern yes = Pattern.compile("(\\d)+");
		Matcher m = yes.matcher(input);
		if (m.find()) {
			return false;
		} else {
			return true;
		}
	}
	
	private static boolean chkAlph() {
		Pattern yes = Pattern.compile("[a-zA-Z]+");
		Matcher m = yes.matcher(input);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean chkOp() {
		Pattern yes = Pattern.compile("(\\+|-|\\*|/|\\^)+");
		Matcher m = yes.matcher(input);
		if (m.find()) {
			return false;
		} else {
			return true;
		}
	}
	
	private static boolean chkSpc() {
		Pattern yes = Pattern.compile("\\s");
		Matcher m = yes.matcher(input);
		if (m.find()) {
			return false;
		} else {
			return true;
		}
	}
	
	private static void reEnter() {
		Scanner in=new Scanner(System.in);
		System.out.print("\nEnter Another Expression: ");
		input=in.nextLine();
		validate();
		Main.user=input;
	}
	
	static void convAn() {
		String choice;
		Scanner in=new Scanner(System.in);
		System.out.print("\nConvert Another Prefix/Postfix Expression? [Y/N]: ");
		choice=in.nextLine();
		switch (choice) {
		case "Y":
		case "y":
			reEnter();
			break;
		case "N":
		case "n":
			process.exit();
			exit=true;
			break;
		}
	}
}
