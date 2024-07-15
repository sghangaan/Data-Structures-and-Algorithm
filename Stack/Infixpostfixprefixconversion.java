package Stack;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Infixpostfixprefixconversion {
    
    static int size;
	static String infix, space = " ";
	static boolean exit=false;
	static Scanner input = new Scanner(System.in);
	
		
		public static void main(String[] args) {
				System.out.println("\n----------| PROGRAM FOR INFIX TO POSTFIX/PREFIX CONVERSION |----------\n");	
				
				System.out.print("Enter Infix String: ");
				infix=input.nextLine();

				if (invalidChars()) {
					System.out.println("INVALID CHARACTERS");
					reEnter();
				} else if (checkOperators()) {
					System.out.println("INPUT HAS NO OPERANDS");
					reEnter();
				} else if (checkSpaces()) {
					System.out.println("INPUT HAS NO SPACES (Input needs spaces between operands/operators)");
					reEnter();
				} else if (checkParenthesis()) {
					if (invalidParenthesis()) {
						System.out.println("INPUT HAS INCORRECT PARENTHESIS");
						reEnter();
					}
				} else if (invalidInfix()) {
					System.out.println("INPUT IS NOT AN INFIX STRING");
					reEnter();
				}
				
				int choice;
				do {
					printMenu();
					System.out.print("\t Enter Choice [1..3]: ");
					choice=input.nextInt();
					chosen(choice);
				} while (exit==false);
				
		}
		
		static void reEnter() {
			System.out.print("Re-Enter Infix String: ");
			infix=input.next();
		}
		
		static boolean invalidChars() {
			Pattern yes = Pattern.compile("[a-zA-Z]+");
			Matcher m = yes.matcher(infix);
			if (m.find()) {
				return false;
			} else {
				return true;
			}
		}
		
		static boolean checkOperators() {
			Pattern yes = Pattern.compile("(\\+|-|\\*|/|\\^)+");
			Matcher m = yes.matcher(infix);
			if (m.find()) {
				return false;
			} else {
				return true;
			}
		}
		
		static boolean checkSpaces() {
			Pattern yes = Pattern.compile(" ");
			Matcher m = yes.matcher(infix);
			if (m.find()) {
				return false;
			} else {
				return true;
			}
		}
		
		static boolean invalidParenthesis() {
			String temp=infix;
			Pattern regex = Pattern.compile("\\(([^()]*)\\)");
	        Matcher m = regex.matcher(temp);
	        while (m.find()) {
	            temp = m.replaceFirst(m.group(1));
	            m.reset(temp);
	        }
	        regex = Pattern.compile("[()]");
	        m = regex.matcher(temp);
	        if (m.find()) {
	            return true;
	        }
	        return false;
		}
		
		static boolean checkParenthesis() {
			Pattern yes = Pattern.compile("^"+"[()]+"+"$");
			Matcher m = yes.matcher(infix);
			if (m.find()) {
				return false;
			} else {
				return true;
			}
		}
		
		static boolean invalidInfix() {
			String[] temp = infix.split(" ");
			
			for (int b=0; b<temp.length-1; b++) {
				if (temp[b].matches("[()]")) {
					continue;
				} else if (temp[b].matches("[a-zA-z]") && temp[b+1].matches("[()]"))  {
					continue;
				} else if (temp[b].matches("[a-zA-z]") && temp[b+1].matches("(\\+|-|\\*|/|\\^)+"))  {
					continue;
				} else if (temp[b].matches("(\\+|-|\\*|/|\\^)+") && temp[b+1].matches("[a-zA-z]"))  {
					continue;
				} else if (temp[b].matches(" ")) {
					continue;
				} else {
					return true;
				}
			}
			return false;
		}
		
		static void printMenu() {
			System.out.println("\n\tMENU");
			System.out.println("\t1.Convert Infix to Prefix");
			System.out.println("\t2.Convert Infix to Postfix");
			System.out.println("\t3.EXIT");
		}
		
		static void chosen(int user) {
			switch (user) {
				case 1:
					prefix();
					break;
				case 2:
					postfix();
					break;
				case 3:
					exit();
					break;
			}
		}

		static char[] Stack = new char[20];
		static int top = -1;
		static int sampleMax = 20;
		
		static void prefix() {
			String in = infix.replaceAll(" ", "");
			int s=0;
			char ch;
			String nstr = "";
			String pre = "";
			String prefix = "";	
			
			for (int i=0; i<infix.length(); i++) {
		        ch= infix.charAt(i);
		        nstr= ch+nstr;
		    }
			
			while(s < in.length()) {
				if(in.charAt(s)>='a' && in.charAt(s)<='z' && in.charAt(s)>='A' && in.charAt(s)<='Z'){
					prefix += in.charAt(s)+space;
			        s++;
				} else if(in.charAt(s)=='(') {
					push(in.charAt(s));
			        s++;
				} else if(in.charAt(s)==')') {
					if(in.charAt(s)==')') {
						while(Stack[top]!='(') {
							prefix += pop()+space;
						}
						pop();
						s++;
					}
				} else {	
					if(top==-1) {
						push(in.charAt(s));
						s++;
					} else if( prec(in.charAt(s)) <= prec(Stack[top])) {
						prefix += pop()+space;
						while(prec(Stack[top]) == prec(in.charAt(s))){
							prefix += pop()+space;
							if(top < 0) {
								break;
							}
						}
						push(in.charAt(s));
						s++;
					} else if(prec(in.charAt(s)) > prec(Stack[top])) {
						push(in.charAt(s));
						s++;
					}
				}
			}
			
			while(top!=-1) {
				prefix += pop()+space;
			}
			
			for (int i=0; i<prefix.length(); i++) {
		        ch= prefix.charAt(i); //extracts each character
		        pre= ch+pre; //adds each character in front of the existing string
		    }
			
			System.out.println("\n#---| INFIX TO PREFIX |---#\n");
			System.out.println("Infix String: " + infix);
			System.out.println("Reversed Infix: " + nstr);
			System.out.println("Output String: " + pre);
			System.out.println("Final prefix String is : " + prefix);
		}
		
		static int prec( char checker )
	    {
	        if(checker == '+' || checker =='-') {
	            return(1);
	        }
	        if(checker == '*' || checker =='/') {
	            return(2);
	        }
	        if(checker == '^') {
	            return(3);
	        }
	        return 0;
	    	}

		static void push(char oper) {
	        if(top==sampleMax-1) {
	            System.out.println("Stack is Full");
	        }
	        else {
	            top++;
	            Stack[top]=oper;
	        }
	    }
	 
	  static char pop() {
	        char w;
	        if(top==-1) {
	            System.out.println("Stack is Empty");
	        }
	        else {
	            w = Stack[top];
	            Stack[top]='\0';
	            top--;
	            return(w);
	        }
	        return 0;
	    }
		
		static void postfix() {
			String in = infix.replaceAll(" ", "");
			String result = "";
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i <in.length() ; i++) {
				char c = in.charAt(i);
				if(prec(c)>0){
					while(stack.isEmpty()==false && prec(stack.peek())>=prec(c)){
						result += stack.pop()+space;
					}
					stack.push(c);
				} else if(c==')'){
					char x = stack.pop();
					while(x!='('){
						result += x+space;
						x = stack.pop();
					}
				} else if(c=='('){
					stack.push(c);
				} else{
					//character is neither operator nor ( 
					result += c + space;
				}
			}
			
			for (int i = 0; i <=stack.size() ; i++) {
				result += stack.pop()+space;
			}
			System.out.println("\n#---| INFIX TO POSTFIX |---#\n");
			System.out.println("Infix Expression: " + infix);
			System.out.println("Postfix Expression: " + result);
			    
			}
		
		static void exit() {
			System.out.println("\n");
			System.out.println("# =========================================================================== #");		
			System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
			System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
			System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
			System.out.println("# =========================================================================== #");	
			exit=true;
		}
	
}
