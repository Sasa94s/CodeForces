import java.io.IOException;

/**
A. Solve Equation
time limit per test1 second
memory limit per test64 megabytes
inputstandard input
outputstandard output
Given an equation with one unknown variable x, find the value of x that satisfies the equation. The equation will be one of three forms:

x + number1 = number2
number1 + x = number2
number1 + number2 = x
Input
string representing the equation. It'll contain characters '+', 'x', '=', two integers (number1 & number2) and all will be separated using spaces.

( - 1000  ≤  number1, number2  ≤  1000)

Output
The value of x.

Examples
input
x + 5 = 9
output
4
input
5 + x = 9
output
4
input
-3 + -2 = x
output
-5
**/

public class SolveEquation {
	public static void main(String[] args) {
		try {
			String input = new String();
			int ch;
			while ((ch = System.in.read()) != '\n')
			     input = input+(char) ch;
			int output = checkEqn(input);
			System.out.println(output);
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	static int checkEqn(String eqn){
		StringBuilder eqn2 = new StringBuilder();
		for (int i = 0; i < eqn.split(" ", 0).length; i++) {
			eqn2.append(eqn.split(" ", 0)[i]);
		}
		boolean type1 = eqn2.substring(0,eqn2.indexOf("+")).equals("x");
		boolean type2 = eqn2.substring(eqn2.indexOf("+")+1, eqn2.indexOf("=")).equals("x");
		boolean type3 = eqn2.substring(eqn2.indexOf("=")+1, eqn2.length()-1).equals("x");
		boolean type4 = eqn2.substring(0,eqn2.indexOf("+")).equals("-x");
		boolean type5 = eqn2.substring(eqn2.indexOf("+")+1, eqn2.indexOf("=")).equals("-x");
		boolean type6 = eqn2.substring(eqn2.indexOf("=")+1, eqn2.length()-1).equals("-x");
		if(type1){
			return SolveEqn1(Integer.parseInt(eqn2.substring(eqn2.indexOf("+")+1, eqn2.indexOf("="))),Integer.parseInt(eqn2.substring(eqn2.indexOf("=")+1, eqn2.length()-1)));	
		}else if(type2){
			return SolveEqn1(Integer.parseInt(eqn2.substring(0,eqn2.indexOf("+"))), Integer.parseInt(eqn2.substring(eqn2.indexOf("=")+1, eqn2.length()-1)));
		} else if(type3){
			return SolveEqn2(Integer.parseInt(eqn2.substring(0,eqn2.indexOf("+"))), Integer.parseInt(eqn2.substring(eqn2.indexOf("+")+1, eqn2.indexOf("="))));
		} else if(type4){
			return SolveEqn3(Integer.parseInt(eqn2.substring(eqn2.indexOf("+")+1, eqn2.indexOf("="))),Integer.parseInt(eqn2.substring(eqn2.indexOf("=")+1, eqn2.length()-1)));
		} else if (type5){
			return SolveEqn3(Integer.parseInt(eqn2.substring(0,eqn2.indexOf("+"))), Integer.parseInt(eqn2.substring(eqn2.indexOf("=")+1, eqn2.length()-1)));
		} else if (type6){
			return SolveEqn4(Integer.parseInt(eqn2.substring(0,eqn2.indexOf("+"))), Integer.parseInt(eqn2.substring(eqn2.indexOf("+")+1, eqn2.indexOf("="))));
		} else return 0;

		//first item
		//System.out.println(Integer.parseInt(eqn2.substring(0,eqn2.indexOf("+"))));
		//second item
		//System.out.println(Integer.parseInt(eqn2.substring(eqn2.indexOf("+")+1, eqn2.indexOf("="))));
		//third item
		//System.out.println(Integer.parseInt(eqn2.substring(eqn2.indexOf("=")+1, eqn2.length())));
	}
	
	static int SolveEqn1(int number1, int number2){
		return number2 - number1;
	}
	static int SolveEqn2(int number1, int number2){
		return number1 + number2;
	}
	static int SolveEqn3(int number1, int number2){
		return number1 - number2;
	}
	static int SolveEqn4(int number1, int number2){
		return -(number1 + number2);
	}
}
