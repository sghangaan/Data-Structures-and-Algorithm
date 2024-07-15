package Stack.StackEvaluation;

public class notation {
	public static boolean pre=false, post=false, inf=false, exit=false;
	public static String say, input;
	
	public static void check() {
		String[] temp = input.split(" ");
		if (temp[0].matches("(\\+|-|\\*|/|\\^)+")) {
			pre=true;
			say="Prefix";
		} else if (temp[0].matches("(\\d)+")&&temp[1].matches("(\\d)+")) {
			post=true;
			say="Postfix";
		} else {
			inf=true;
			say="Infix";
		}
	}
	
	public static void post() {
		String[] temp = input.split(" ");
		int[] stack = new int[temp.length];
		int top=-1, res=0;
		System.out.println("\n#####| EVALUATING POSTFIX EXPRESSION |#####");
		System.out.println("\nSolution:");
		for (int x=0; x<temp.length; x++) {
			if (temp[x].matches("(\\d)+")) {
				top++;
				stack[top]=Integer.parseInt(temp[x]);
			} else if (temp[x].matches("(\\+|-|\\*|/|\\^)+")) {
				res = process.oper(temp[x],stack,stack[top-1],stack[top],top);
				top--;
			}
		}
		System.out.println("\nResult of ["+input+"] is equals to "+res);
	}
	
	public static void pre() {
		String[] temp = input.split(" ");
		int[] stack = new int[temp.length];
		System.out.println("\n#####| EVALUATING PREFIX EXPRESSION |#####");
		int top=-1, res=0;
		String ch;
		String[] rvrs = new String[temp.length];
		
		for (int i=0, j=temp.length-1; i<temp.length; i++, j--) {
	    	rvrs[i]=temp[j];
	    }
		
		System.out.println("\nReversed Prefix String: ");
		for (int a=0; a<rvrs.length; a++) {
			System.out.print(rvrs[a]+" ");
		}
		
		System.out.println("\nSolution:");
		for (int x=0; x<rvrs.length; x++) {
			if (rvrs[x].matches("(\\d)+")) {
				top++;
				stack[top]=Integer.parseInt(rvrs[x]);
			} else if (rvrs[x].matches("(\\+|-|\\*|/|\\^)+")) {
				res = process.oper(rvrs[x],stack,stack[top],stack[top-1],top);
				top--;
			}
		}
		System.out.println("\nResult of ["+input+"] is equals to "+res);
	}
}


