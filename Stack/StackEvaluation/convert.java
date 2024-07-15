package Stack.StackEvaluation;

import java.util.Scanner;
import java.util.Stack;

public class convert {
public static String input;
	
	public static void choose() {
		int choice;
		boolean error=false;
		Scanner in=new Scanner(System.in);
		System.out.println("\nChoose conversion method:\n1:Infix to Postfix\n2:Infix to Prefix");
		System.out.print("Enter Option [1 or 2]: ");
		choice=in.nextInt();
		do {
			if (choice==1) {
				notation.input = toPost();
				notation.post();
				error=false;
			} else if (choice==2) {
				notation.input = toPre();
				notation.pre();
				error=false;
			} else {
				System.out.println("Invalid Choice");
				error=true;
				System.out.print("Re-enter Option [1 or 2]: ");
				choice=in.nextInt();
			}
		} while (error);
	}
	
	private static String toPost() {
		String in = input.replaceAll(" ", "");
		String result = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i <in.length() ; i++) {
			char c = in.charAt(i);
			if(process.prec(c)>0){
				while(stack.isEmpty()==false && process.prec(stack.peek())>=process.prec(c)){
					result += stack.pop()+" ";
				}
				stack.push(c);
			} else if(c==')'){
				char x = stack.pop();
				while(x!='('){
					result += x+" ";
					x = stack.pop();
				}
			} else if(c=='('){
				stack.push(c);
			} else{ 
				result += c + " ";
			}
		}
		
		for (int i = 0; i <=stack.size() ; i++) {
			result += stack.pop()+" ";
		}
		System.out.println("\n#---| INFIX TO POSTFIX |---#\n");
		System.out.println("Infix Expression: " + input);
		System.out.println("Postfix Expression: " + result);
		
		return result;
	}
	
	private static String toPre() {
		String in = input.replaceAll(" ", "");
		String result = "";
		String finResult="";
		String revIn="";
		Stack<Character> stack = new Stack<>();
		
		for (int a = 0; a < input.length(); a++) {
			revIn = input.charAt(a) + revIn;
		}
		
		for (int x = 0; x < in.length(); x++) {
			char c = in.charAt(x);
            if (c == '(') {
                c = ')';
                x++;
            }
            else if (c == ')') {
                c = '(';
                x++;
            }
        }
		
        for (int y = 0; y <in.length() ; y++) {
        	char c = in.charAt(y);
            if (process.prec(c)>0) {
                while (stack.isEmpty()==false && process.prec(stack.peek())>=process.prec(c)) {
                    result += stack.pop()+" ";
                }
                stack.push(c);
            } else if(c==')') {
                char x = stack.pop();
                while(x!='(') {
                    result+= x+" ";
                    x = stack.pop();
                }
            } else if (c=='(') {
                stack.push(c);
            } else {
                result += c+" ";
            }
        }

        for (int b = 0; b <=stack.size() ; b++) {
            result+= stack.pop()+" ";
        }
        
        for (int d = 0; d < result.length() ; d++) {
            finResult = result.charAt(d) + finResult;
        }
        
        System.out.println("\n#---| INFIX TO PREFIX |---#\n");
		System.out.println("Infix Expression: " + input);
		System.out.println("Reverse Infix Expression: "+revIn);
		System.out.println("Reverse Prefix Expression: "+ result);
		System.out.println("Postfix Expression: " + finResult);
		
		return finResult;
	}
}