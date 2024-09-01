/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static String powerOf2(int n){
        if(n==0){
            return "Not a power of 2";
        }
        if((n&(n-1))==0){
            return "Yes it is power of 2";
        }else{
            return "Not a power of 2";
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(powerOf2(n));
	}
}
