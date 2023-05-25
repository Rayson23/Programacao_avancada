/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int a=10, b=6;
		System.out.println("soma=" + soma (a, b));
		System.out.println("subtracao=" + subtracao (a, b));
		System.out.println("divisao=" + divisao (a, b));
		System.out.println("produto=" + divisao (a, b));
		System.out.println("resto=" + resto (a, b));
	}
    	public static int soma ( int a , int b) {
	      return a + b;
	}
		public static int subtracao ( int a , int b) {
	      return a - b;
		}
		public static int divisao ( int a , int b ) {
	    if (b==0)return 0;
	      return a / b;
		}
			public static int produto ( int a , int b) {
	    return a * b;
		}
		public static int resto ( int a , int b) {
	       return a % b;
		}
}

