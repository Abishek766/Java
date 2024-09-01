/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void primeFactors(int n){
        //tc: for composite number:O(1) for prime numbers:O(n)--worst case
        int i =2;
        while(n>1){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            i++;
        }
    }
    static void optimisedPrimeFactors(int n){
        //optimised apporach
        //tc:O(square root of n *log(n))
        int i =2;
        while(i*i<=n){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            i++;
        }
        if(n>1){
            System.out.println(n);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeFactors(n);
	}
}
