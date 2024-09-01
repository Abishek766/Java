/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int trailingZeros(int n){
        return (int)(Math.log10((n^(n&n-1)))/Math.log10(2));
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(trailingZeros(sc.nextInt()));
	}
}
