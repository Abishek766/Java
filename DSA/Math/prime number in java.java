/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void isPrime(int n){
        // normal brute force method tc O(n)
        boolean a =true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                a=false;
                break;
            }
        }
        if(a){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
     public static void prime(int n){
        // optimised method tc: O(square root(n))
        boolean a =true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                a=false;
                break;
            }
        }
        if(a){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    public static void optimisedPrime(int n){
        // optimised method tc: O(square root(n))
        // but it is more optimised then previous apporach
        //because it jumps 6 times
        boolean a =true;
        if(n==1){
            a=false;
        }
        if(n==2||n==3){
            a=true;
        }
        if(n%2==0||n%3==0){
            a=false;
        }
        for(int i =5;i*i<=n;i=i+6){
            if(n%i==0||n%(i+2)==0){
                a=false;
            }
        }
        if(a){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isPrime(n);
		prime(n);
		optimisedPrime(n);
	}
}
