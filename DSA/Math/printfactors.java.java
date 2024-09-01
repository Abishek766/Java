/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void printFactors(int n){
        // Normal brute force Apporach
        //tc:O(n)
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    static void optimisedPrintFactors(int n)
    {
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		optimisedPrintFactors(n);
	}
}
