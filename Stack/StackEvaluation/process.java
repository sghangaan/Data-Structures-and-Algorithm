package Stack.StackEvaluation;

import java.lang.Math;

public class process {
	public static int oper(String elem, int[] stck, int num1, int num2, int tp) {
		int out = 0;
		if (elem.matches("(\\+)")) {
			out = num1 + num2;
			System.out.println(num1+" + "+num2+" = "+out);
			stck[tp]=0;
			stck[tp-1]= out;
			return out;
		} else if (elem.matches("(-)")) {
			out = num1 - num2;
			System.out.println(num1+" - "+num2+" = "+out);
			stck[tp]=0;
			stck[tp-1]= out;
			return out;
		} else if (elem.matches("(\\*)")) {
			out = num1 * num2;
			System.out.println(num1+" * "+num2+" = "+out);
			stck[tp]=0;
			stck[tp-1]= out;
			return out;
		} else if (elem.matches("(/)")) {
			out = num1 / num2;
			System.out.println(num1+" / "+num2+" = "+out);
			stck[tp]=0;
			stck[tp-1]= out;
			return out;
		}  else if (elem.matches("(\\^)")) {
			out = (int) Math.pow(num1,num2);
			System.out.println(num1+"^"+num2+" = "+out);
			stck[tp]=0;
			stck[tp-1]= out;
			return out;
		}
		return out;
	}
	
	public static int prec( char checker )
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
	
	public static void exit() {
		System.out.println("\n");
		System.out.println("# =========================================================================== #");		
		System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
		System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
		System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
		System.out.println("# =========================================================================== #");	
	}
}